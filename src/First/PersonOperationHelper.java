package First;

import java.util.LinkedList;
import java.util.List;
public class PersonOperationHelper {
public List<Person> convertListOfStringToListOfPeople(List<String> list) throws InvalidSalaryException {
    LinkedList<Person> listOfPeople = new LinkedList<>();
    for (String data : list) {
    listOfPeople.add(convertStringToPerson(data));
    }
    return listOfPeople;
    }
    private Person convertStringToPerson(String dane) throws InvalidSalaryException {
        Person person = new Person();
        String[] data = dane.split(";");
        person.setName(data[0]);
        person.setSurname(data[1]);
        person.setAge(Integer.parseInt(data[2]));
        person.setCity(data[3]);
        person.setSalary(Double.parseDouble(data[4]));
        if (data[4].contains(",")) {
            throw new InvalidSalaryException("Zla pensja");
        }
        person.setSex(data[5].charAt(0));
        return person;
    }
}
