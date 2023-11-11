
package package1;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;



class NewCity {
    public static void main(String[] args) throws JAXBException {

        City city = new City();
        city.setName("Одеса");
        city.setStreet("Деребасовська");
        city.setNumber(3);

        File file = new File("city.xml");


        JAXBContext context = JAXBContext.newInstance(City.class);
        Marshaller marshaller = context.createMarshaller();

        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        marshaller.marshal(city, file);
        marshaller.marshal(city, System.out);
    }
}

