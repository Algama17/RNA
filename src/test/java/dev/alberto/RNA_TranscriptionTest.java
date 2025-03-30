package dev.alberto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RNA_TranscriptionTest {

    @Test
    void transcribirCadenaVacia(){
       RNA_Transcription transcription = new RNA_Transcription();
       assertEquals("", transcription.transcribe("")); 
    }
}
