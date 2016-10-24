package practice;

import java.util.Iterator;
 
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
 
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
 
public class DomTest {
 
    /*
     * ����XML
     */
    public void read(String fileName) throws Exception {
        // ���幤��API ʹӦ�ó����ܹ���XML�ĵ���ȡ����DOM�������Ľ�����
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        // ��ȡ�����ʵ��֮�󣬽����ԴӸ�������Դ����XML
        DocumentBuilder builder = factory.newDocumentBuilder();
        // builder.parse(this.getClass().getResourceAsStream("/" + fileName));
        // Document�ӿڱ�ʾ����HTML��XML�ĵ����Ӹ����Ͻ��������ĵ����ĸ������ṩ���ĵ����ݵĻ�������
        Document document = builder.parse(this.getClass().getResourceAsStream("/practice/applicationContext.xml"));
        // ��ȡ���ڵ�
        Element root = document.getDocumentElement();
        System.out.println(root.getNodeName());
 
        //��ȡdatabase�ڵ�NodeList�ӿ��ṩ�Խڵ�����򼯺ϵĳ���
        NodeList nodeList = root.getElementsByTagName("bean");
        for (int i = 0; i < nodeList.getLength(); i++) {
            // ��ȡһ���ڵ�
            Node node = nodeList.item(i);
            // ��ȡ�ýڵ���������
            NamedNodeMap attributes = node.getAttributes();
            for (int j = 0; j < attributes.getLength(); j++) {
                Node attribute = attributes.item(j);
                System.out.println(attribute.getNodeName() + ":"
                        + attribute.getNodeValue());
            }
            //��ȡ�����ӽڵ�����
            NodeList childNodes=node.getChildNodes();
            for (int j = 0; j < childNodes.getLength(); j++) {
                Node childNode=childNodes.item(j);
                System.out.println(childNode.getNodeName()+":"+childNode.getNodeValue());
            }
        }
    }
 
    public static void main(String[] args) throws Exception {
        new DomTest().read("pom.xml");
 
    }
}