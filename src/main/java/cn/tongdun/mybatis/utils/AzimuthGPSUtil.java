package cn.tongdun.mybatis.utils;

public class AzimuthGPSUtil {

    private static double gps2d(double lat_a, double lng_a, double lat_b, double lng_b) {
        double d = 0;
        lat_a = lat_a * Math.PI / 180;
        lng_a = lng_a * Math.PI / 180;
        lat_b = lat_b * Math.PI / 180;
        lng_b = lng_b * Math.PI / 180;

        d = Math.sin(lat_a) * Math.sin(lat_b) + Math.cos(lat_a) * Math.cos(lat_b) * Math.cos(lng_b - lng_a);
        d = Math.sqrt(1 - d * d);
        d = Math.cos(lat_b) * Math.sin(lng_b - lng_a) / d;
        d = Math.asin(d) * 180 / Math.PI;
//     d = Math.round(d*10000);
        return d;
    }


    // 更为准确
    public static double bearing(double lat1, double lon1, double lat2, double lon2) {
        double longitude1 = lon1;
        double longitude2 = lon2;
        double latitude1 = Math.toRadians(lat1);
        double latitude2 = Math.toRadians(lat2);
        double longDiff = Math.toRadians(longitude2 - longitude1);
        double y = Math.sin(longDiff) * Math.cos(latitude2);
        double x = Math.cos(latitude1) * Math.sin(latitude2) - Math.sin(latitude1) * Math.cos(latitude2) * Math.cos(longDiff);
        return (Math.toDegrees(Math.atan2(y, x)) + 360) % 360;
    }

    public static void main(String[] args) {
        // 30.271478,120.206979

        // 30.256755,120.207554
        // 30.252637,120.199792

        // 30.259125,120.208272
        // 30.253635,120.187863
        double srcLatitude = 30.25238333;
        double srcLongitude = 120.181755;

        // 34.346258,111.876884
        double tagLatitude = 30.247745;
        double tagLongitude = 120.17785;  // 59.03950062765323

//        double tagLatitude = 30.232794;
//        double tagLongitude = 120.174065;  // 59.03950062765323
        double azimuth = gps2d(srcLatitude, srcLongitude, tagLatitude, tagLongitude);
        double azimuth2 = bearing(srcLatitude, srcLongitude, tagLatitude, tagLongitude);
        System.out.println(azimuth); // 69.20620648400649
        System.out.println(azimuth2); // 216.02790890690147  实际：211.58
    }
}
