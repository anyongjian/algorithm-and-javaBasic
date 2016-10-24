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
     * 解析XML
     */
    public void read(String fileName) throws Exception {
        // 定义工厂API 使应用程序能够从XML文档获取生成DOM对象树的解析器
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        // 获取此类的实例之后，将可以从各种输入源解析XML
        DocumentBuilder builder = factory.newDocumentBuilder();
        // builder.parse(this.getClass().getResourceAsStream("/" + fileName));
        // Document接口表示整个HTML或XML文档，从概念上讲，它是文档树的根，并提供对文档数据的基本访问
        Document document = builder.parse(this.getClass().getResourceAsStream("/practice/applicationContext.xml"));
        // 获取根节点
        Element root = document.getDocumentElement();
        System.out.println(root.getNodeName());
 
        //读取database节点NodeList接口提供对节点的有序集合的抽象
        NodeList nodeList = root.getElementsByTagName("bean");
        for (int i = 0; i < nodeList.getLength(); i++) {
            // 获取一个节点
            Node node = nodeList.item(i);
            // 获取该节点所有属性
            NamedNodeMap attributes = node.getAttributes();
            for (int j = 0; j < attributes.getLength(); j++) {
                Node attribute = attributes.item(j);
                System.out.println(attribute.getNodeName() + ":"
                        + attribute.getNodeValue());
            }
            //获取所有子节点数据
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