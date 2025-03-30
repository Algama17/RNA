package dev.alberto;

public class RNA_Transcription {

    public String transcribe(String dna){
        if (dna.equals("G")) {
            return "C";
            
        }else if (dna.equals("C")) {
            return "G";
        
        }else if (dna.equals("T")) {
            return "A";
        }

        
        return "";
    }
}
