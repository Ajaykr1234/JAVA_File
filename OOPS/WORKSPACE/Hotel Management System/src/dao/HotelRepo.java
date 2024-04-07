package dao;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import entity.Customer;

public interface HotelRepo {
	ArrayList<Customer> al = new ArrayList<Customer>();
	LinkedHashMap<Integer,Customer> cm = new LinkedHashMap<Integer,Customer>();
	LinkedHashMap<Integer,Customer> sm = new LinkedHashMap<Integer,Customer>();
	LinkedHashMap<Integer,Customer> dm = new LinkedHashMap<Integer,Customer>();


}
