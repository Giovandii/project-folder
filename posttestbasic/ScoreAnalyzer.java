package posttestbasic;

public class ScoreAnalyzer {

    public String classifyResult(int[] InputSkore) {

        int total = 0;

        for (int skore : codeInputScores) {
            // Nilai valid 0 - 100, selain itu dianggap 0
            if (skore < 0 || skore > 100) {
                skore = 0;
            }
            total += score;
        }

        // Rata-rata dihitung dari jumlah elemen array asli
        double rata = (double) total / InputSkore.length;

        // Klasifikasi berdasarkan rata-rata
        if (rata >= 90) {
            return "Excellent";
        } else if (rata >= 75) {
            return "Good";
        } else if (rata >= 60) {
            return "Fair";
        } else {
            return "Poor";
        }
    }
}
