import java.io.StringWriter;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;


public class createXML {

    public static void main(String args[]) throws Exception
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        Customer c = new Customer();
        c.setAge(45);
        c.setDesc("some desc ");
        c.setId(23);
        c.setList(list);
        c.setName("name");
        JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        StringWriter sw = new StringWriter();
        jaxbMarshaller.marshal(c, sw);
        String xmlString = sw.toString();
        System.out.println(xmlString);
    }

}
