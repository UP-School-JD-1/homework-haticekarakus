package personList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class Main {

	public static void main(String[] args) {
		
		List<Person> personList=new ArrayList<>();
		personList.add(new Person("hatice","karakus",new ArrayList<>(List.of("5551111111","5367775432")),new ArrayList<>(List.of("istanbul","izmir"))));
		personList.add(new Person("kader","aycicek",new ArrayList<>(List.of("5551131111","5367775432")),new ArrayList<>(List.of("istanbul"))));
		personList.add(new Person("kerim","bal",new ArrayList<>(List.of("55351111","5367775432")),new ArrayList<>(List.of("Edirne"))));
		personList.add(new Person("serenay","han",new ArrayList<>(List.of("555151")),new ArrayList<>(List.of("Isparta"))));
		
		System.out.println("--Person List--");
		for (Person b : personList)
			System.out.println(b.toString());
		
		System.out.println();
		
		System.out.println("--Order By Last Name--");
		Comparator<Person> personLastName = (b1, b2) -> b1.getLastName().compareTo(b2.getLastName());
		Collections.sort(personList, personLastName);
		for (Person b : personList)
			System.out.println(b.toString());
		
		Map<String, Person> map = new HashMap<>();
		map.put(personList.get(0).getFirstName(), personList.get(0));
		map.put(personList.get(1).getFirstName(), personList.get(1));
		map.put(personList.get(2).getFirstName(), personList.get(2));
		map.put(personList.get(3).getFirstName(), personList.get(3));
		

		System.out.println("*** Entry set *** ");
		Set entrySet = map.entrySet();
		entrySet.forEach(System.out::println);
		
		System.out.println();
		
        System.out.println("Is kader on the list: " + map.containsKey("kader"));
        System.out.println("Is ali on the list: " + map.containsKey("ali"));
		

		
		

	}
	public static <K, V> Set<K> getKeys(Map<K, V> map, V value) {
	    Set<K> keys = new HashSet<>();
	    for (Entry<K, V> entry : map.entrySet()) {
	        if (entry.getValue().equals(value)) {
	            keys.add(entry.getKey());
	        }
	    }
	    return keys;
	}

}
