/*
 * JBoss, Home of Professional Open Source
 * Copyright 2013, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.switchyard.quickstarts.bpel.xts.wsat.ws;

/**
 * 
 * Airport manager checks by flight identifier that the flight has available
 * tickets.
 * 
 */
public final class AirportManager {

    /**
     * Cities which can be used to have flight.
     */
    public static final String[] CITIES = {"Brno", "Prague", "London" };

    private AirportManager() {

    }

    /**
     * Check flight identifier. 
     * @param fltid flight identifier
     * @return true if flight is valid and available, otherwise returns false 
     */
    public static boolean checkFLTID(String fltid) {
        boolean state = false;
        String[] parts = fltid.split("/");
        if (parts.length != 4) {
            return state;
        }
        for (int i = 0; i < 2; i++) {
            state = false;
            for (String city : CITIES) {
                if (parts[i].compareTo(city) == 0) {
                    state = true;
                    break;
                }
            }
            if (!state) {
                return state;
            }
        }
        return state;
    }

}