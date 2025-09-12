package com.shimbhu.karney;

import net.sf.geographiclib.Geodesic;
import net.sf.geographiclib.GeodesicData;

public class Main {
    public static void main(String[] args) {
        // Delhi coordinates
        double lat1 = 28.6139;
        double lon1 = 77.2090;

        // Mumbai coordinates
        double lat2 = 19.0760;
        double lon2 = 72.8777;

        // Compute geodesic distance and bearings using WGS84 ellipsoid
        GeodesicData result = Geodesic.WGS84.Inverse(lat1, lon1, lat2, lon2);

        // Output results
        System.out.printf("Distance from Delhi to Mumbai: %.3f kilometers\n", result.s12 / 1000);
        System.out.printf("Initial bearing: %.3f degrees\n", result.azi1);
        System.out.printf("Final bearing: %.3f degrees\n", result.azi2);
    }
}

