/* Створіть клас, використовуючи JAXB, де опишіть ієрархію XML файлу.
 Необхідно, щоб проект створював XML-файл і будував дерево (місто, назва вулиці, будинок).
 У місті використовуйте аттрибут (наприклад, <city size=”big>Kiev</city>).
 */


package package1;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class City {
    private String name;
    private String street;
    private int number;

    public String getName() {
        return name;
    }
    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }
    @XmlElement
    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }
    @XmlAttribute
    public void setNumber(int number) {
        this.number = number;
    }


    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", street='" + street + '\'' +
                ", number=" + number +
                '}';
    }
}

