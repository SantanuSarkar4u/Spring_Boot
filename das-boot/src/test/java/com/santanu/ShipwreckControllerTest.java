package com.santanu;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import com.santanu.controller.ShipwreckController;
import com.santanu.model.Shipwreck;
import com.santanu.repository.ShipwreckRepository;

public class ShipwreckControllerTest {
	
	@InjectMocks
	private ShipwreckController sc;
	
	@Mock
	private ShipwreckRepository sh;
	
	@Before
	public void init(){		
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testShipwreckGet() {
		Shipwreck shipwreck = new Shipwreck();
		shipwreck.setId(1L);
		
		when(sh.findOne(1l)).thenReturn(shipwreck);
		Shipwreck shipwreck2 = sc.get(1L);
		verify(sh).findOne(1l);
		assertEquals(1l,shipwreck2.getId().longValue());
		assertThat(shipwreck2.getId(), is(1l));
	}

}
