package base;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import domain.PersonDomainModel;

public class Student_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testOne() {
		
		PersonDomainModel dpm = new PersonDomainModel();
		PersonDAL.addPerson(dpm);
		dpm.setFirstName("Garrett");
		PersonDAL.updatePerson(dpm);
		assertEquals(dpm.getFirstName(), "Garrett");
		
	}
	
	@Test
	public void testTwo() {
		
		PersonDomainModel person1 = new PersonDomainModel();
		PersonDomainModel person2 = new PersonDomainModel();
		
		ArrayList<PersonDomainModel> perTest = new ArrayList<PersonDomainModel>();
		
		PersonDAL.addPerson(person1);
		PersonDAL.addPerson(person2);
		
		perTest = PersonDAL.getPersons();
		assertTrue(perTest.size() == 2);
	
	}
	
	@Test
	public void testThree() {
		
		PersonDomainModel person1 = new PersonDomainModel();
		PersonDAL.addPerson(person1);
		assertTrue(PersonDAL.getPersons().size() == 1);
		PersonDAL.deletePerson(person1);
		assertTrue(PersonDAL.getPersons().size() == 0);
		
		
	}

}
