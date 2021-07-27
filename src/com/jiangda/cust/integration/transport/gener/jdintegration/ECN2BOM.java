package com.jiangda.cust.integration.transport.gener.jdintegration;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ResourceBundle;

import javax.xml.rpc.ServiceException;
import javax.xml.rpc.holders.StringHolder;

import org.apache.axis.client.Stub;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import cn.com.ekingwin.www.CHJ_012_PDM_ECNDataBackhaul.CHJ_012_PDM_ECNDataBackhaulService_ptt;
import cn.com.ekingwin.www.CHJ_012_PDM_ECNDataBackhaul.CHJ_012_PDM_ECNDataBackhaulService_pttBindingQSService;
import cn.com.ekingwin.www.CHJ_012_PDM_ECNDataBackhaul.CHJ_012_PDM_ECNDataBackhaulService_pttBindingQSServiceLocator;

public class ECN2BOM {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("5");
		String xml_path = "C:\\Users\\meng.liang\\Desktop\\A01-RDC-ECN-2019-00320190419134225.xml";
		
		//String asXML="<DATA><HEAD><BIZTRANSACTIONID></BIZTRANSACTIONID><ACCOUNT>BOM</ACCOUNT></HEAD><LIST><ITEM><ROOT UUID=\"\"><MATERIALINFO><ITEM><SERIALNO>1</SERIALNO><PARTNUM>Q890345</PARTNUM><CHANGECODE/><OWNER>zhangyuwa</OWNER><MATERIAL>ABS3650</MATERIAL><MATERIALBEN> </MATERIALBEN><THICKNESS> </THICKNESS><WEIGHT>";
		//String substring = asXML.substring(asXML.indexOf("<PARTNUM>")+9, asXML.indexOf("</PARTNUM>"));
		//String str = substring.substring(0, substring.length()-14);
		//System.out.println("substring-->"+substring);
		//System.out.println("str-->"+str);
		
		
		// TODO Auto-generated method stub
		String uuid = args[0];//"ECN-00000001";//args[0];
		String xmlPath = args[1];//"E:\\ECN-0000000120170509184559.xml";// args[1];
		System.out.println("uuid:" + uuid);
		System.out.println("xmlPath:" + xmlPath);
		try {
			callnewwebservice(xmlPath,uuid);
			System.out.println("process done");
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		/*try {  
            SAXReader reader = new SAXReader(); 
            Document document = reader.read(new File(xmlPath));  
            String xmlString = document.asXML();
            System.out.println(xmlString);
            
            //xmlFile.delete();
            Execute execute = new Execute();
            InputParameter inputParameter = new InputParameter();
            inputParameter.setBizSerialNum(uuid);
            inputParameter.setContent(xmlString);
            execute.setRequestContent(inputParameter);
            
            AuthInfo author = new AuthInfo();
            author.setBusinessType("pdmresponse");
            ResourceBundle registry = ResourceBundle.getBundle("com.jiangda.cust.integration.transport.gener.jdintegration.jdintegration");
//            author.setSystemName("PDM");
//            author.setCredential("123456");
//            author.setPrincipal("PDM");
            author.setSystemName(registry.getString("SystemName"));
            author.setCredential(registry.getString("Credential"));
            author.setPrincipal(registry.getString("Principal"));
            
            JDIntegrationServiceService adptor = new JDIntegrationServiceService();
            JDIntegrationService service = adptor.getJDIntegrationServicePort();
            ExecuteResponse response = service.execute(execute, author);
            OutputParameter output = response.getResponseContent();
            String txtPath = xmlPath.replaceAll(".xml", ".txt");
            File txtFile = new File(txtPath);
            if(txtFile.exists()){
            	txtFile.delete();
            }
            if(output.getErrorMessage() != null && output.getErrorMessage().length() > 0){
            	FileOutputStream out = new FileOutputStream(txtFile);
                out.write(output.getErrorMessage().getBytes());
                out.flush();
                out.close();
            }
            
       } catch (Exception e) {  
            e.printStackTrace();  
       }  */
	}
	public static String constructInput(String xml_path,String matId)
	{
		String response="";
		SAXReader reader = new SAXReader(); 
        Document document;
		try {
			document = reader.read(new File(xml_path));
			String asXML = document.asXML();
			Element root = document.getRootElement();
			Document doc = DocumentHelper.createDocument();
			Element data_root = doc.addElement("DATA");
			Element head_root = data_root.addElement("HEAD");
			Element zit_root = head_root.addElement("BIZTRANSACTIONID");
			if("#".equals(matId)){
				String substring = asXML.substring(asXML.indexOf("<PARTNUM>")+9, asXML.indexOf("</PARTNUM>"));
				System.out.println("ww matId-->" + substring);
				zit_root.addText(substring);
			}else{
				zit_root.addText(matId);//"BOM_08320190409153834"
			}
			Element account_root = head_root.addElement("ACCOUNT");
			account_root.addText("BOM");
			Element list_root = data_root.addElement("LIST");
			Element item_root = list_root.addElement("ITEM");
			item_root.add(root);
			String new_str = doc.getRootElement().asXML();
			response= new_str;
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		return response;
	}
	public static void callnewwebservice(String xml_path,String matId) throws ServiceException, IOException, DocumentException{
		 ResourceBundle registry = ResourceBundle.getBundle("com.jiangda.cust.integration.transport.gener.jdintegration.jdintegration");
		 String url2 = registry.getString("wsdlLocation");
		 CHJ_012_PDM_ECNDataBackhaulService_pttBindingQSService serivce = new  CHJ_012_PDM_ECNDataBackhaulService_pttBindingQSServiceLocator(url2);
		 CHJ_012_PDM_ECNDataBackhaulService_ptt bind =  serivce.getCHJ_012_PDM_ECNDataBackhaulService_pttBindingQSPort();
		 Stub stub=(Stub) bind;
		 stub.setUsername(registry.getString("Username"));
		 stub.setPassword(registry.getString("Password"));
		 StringHolder sign = new StringHolder();
		 StringHolder message = new StringHolder();
		 /*SAXReader reader = new SAXReader(); 
         Document document = reader.read(new File(xml_path));  
         String xmlString = document.asXML();*/
		 String xmlString = constructInput(xml_path,matId);
		 System.out.println("the input xml_string is"+xmlString);
		 bind.CHJ_012_PDM_ECNDataBackhaulService(xmlString, sign, message);
		 String txtPath = xml_path.replaceAll(".xml", ".txt");
         File txtFile = new File(txtPath);
         if(txtFile.exists()){
         	txtFile.delete();
         }
         System.out.println("返回的sign:"+sign+"返回的message:"+message);
		 if(sign.value.equals("0")){//通信正常
			 
		 }
		 else{
			 FileOutputStream out = new FileOutputStream(txtFile);
			 String str="通信失败";
             out.write(str.getBytes());
             out.flush();
             out.close();
		 }
	}
}
