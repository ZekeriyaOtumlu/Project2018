package datastructure;

import com.mongodb.*;
import databases.ConnectToSqlDB;

import java.util.*;

public class UseMap {

	public static void main(String[] args)throws Exception {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

		List<String> BM = new ArrayList<String>();
		BM.add("The Godfather");
		BM.add("The Shawshank Redemption");
		BM.add("Schindler's List");
		BM.add("Raging Bull");
		BM.add("Casablanca");
		BM.add("Citizen Kane ");
		BM.add("Gone with the Wind");
		BM.add(7,"The Wizard of Oz ");

		List<String> myCities = new ArrayList<String>();
		myCities.add("istanbul");
		myCities.add("quito");
		myCities.add("cebu");
		myCities.add("amsterdam");
//
		List<String> motto = new ArrayList<String>();
		motto.add("Ask for a miracle-and receive it ");
		motto.add("Work because I want to, not because I need to");
		motto.add("Discover something I love doing");
		motto.add("Discover the secret to a long and happy life");
		motto.add("Understand Stephen Hawkins Brief History of Time");
		motto.add("Retire comfortably at 50");

		Map<String,List<String>> demo = new HashMap<>();
		demo.put("allBestMovies",BM);
		demo.put("vacationSpots", myCities);
		demo.put("myLifeMotto",motto);

		System.out.println("\n foreach traversal \n");
		for (Map.Entry en: demo.entrySet()) {
			System.out.println(en.getKey());
			System.out.println(en.getValue()+"\n");

		}

		System.out.println("\n iterator traversal \n");
		Iterator<Map.Entry<String, List<String>>> itr = demo.entrySet().iterator();

		while(itr.hasNext())
		{
			Map.Entry entry = itr.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue()+ "\n");
		}

//		ConnectToSqlDB conn = new ConnectToSqlDB();
//		conn.insertStringDataFromArrayListToSqlTable(wishList,"WishList","wishes");
//		List<String> DBData = new ArrayList<String>();
//		try {
//			DBData = conn.readDataBase("WishList","wishes");
//			for (String str: DBData) {
//				System.out.println(str);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		MongoClient mongoClient = new MongoClient("localhost", 27017);
		DB database = mongoClient.getDB("listDB");
		database.createCollection("lists",null);
		DBCollection collection = database.getCollection("lists");

//		//Do this Step only once to avoid multiple insertions
//		BasicDBObject document1 = new BasicDBObject();
//		document1.put("HP",HP);
//		collection.insert(document1);
//
//		//Do this Step only once to avoid multiple insertions
//		BasicDBObject document2 = new BasicDBObject();
//		document2.put("vacation",faveSpots);
//		collection.insert(document2);

		// retrieve the lists from Database
		BasicDBObject searchQuery = new BasicDBObject();
		searchQuery.put("BM", BM);
		DBCursor cursor = collection.find(searchQuery);
		System.out.print("\nretrieved from DB");
		while (cursor.hasNext()) {
			System.out.println("\n"+cursor.next());
		}

		// retrieve the lists from Database
		BasicDBObject searchQuery2 = new BasicDBObject();
		searchQuery2.put("myBestCities",myCities);
		DBCursor cursor2 = collection.find(searchQuery2);
		System.out.print("\nretrieved from DB");
		while (cursor2.hasNext()) {
			System.out.println("\n"+cursor2.next());
		}
	}

}