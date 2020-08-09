/*
 * @author Ankit Varshney
 */

package com.delhitransit.core.model.entity;

import org.junit.jupiter.api.Test;
import com.delhitransit.core.model.parseable.Trip;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TripEntityTest {

    @Test
    void entityFromParseableConstructorTest() {
        String tripId = "tripId";

        Trip trip = new Trip().setTripId(tripId);

        TripEntity tripEntity = new TripEntity(trip);
        assertEquals(tripId, tripEntity.getTripId());
    }

}
