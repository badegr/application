package at.fhv.badegr.application;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import at.fhv.badegr.application.endpoints.SearchEndpoint;
import at.fhv.badegr.application.handlers.HistoryHandler;
import at.fhv.badegr.application.models.History;
import at.fhv.badegr.application.models.HistoryItem;
import at.fhv.badegr.application.models.SearchResult;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {
	
	@Autowired
	private SearchEndpoint se;
	
	@Autowired
	private HistoryHandler hh;
	
	private String testText = "test";
	private String testToken = "4711";
	private SearchResult testSearchResult;
	
	@Before
	public void initialize() {
		testSearchResult = new SearchResult();
		testSearchResult.url = testText;
	}

	@Test
	public void getRandomResultTest() {
		SearchResult re = null;
		try {
			re = se.searchRandom("123123");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertTrue(re != null);
	}
	
	@SuppressWarnings("unlikely-arg-type")
	@Test
	public void testAddToHistory() {
		try {
			hh.addHistory(testToken, null, testSearchResult);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		History hist = null;
		
		try {
			hist = hh.getHistory(testToken);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertTrue(hist != null);
		
		boolean addedIsPresent = false;
		for(HistoryItem hi : hist.items) {
			if (hi.result.url == testText) {
				addedIsPresent = true;
			}
		}
		assertTrue(addedIsPresent);
	}

}
	

