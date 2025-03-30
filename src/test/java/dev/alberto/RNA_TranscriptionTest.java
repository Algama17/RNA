package dev.alberto;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class RNA_TranscriptionTest {

    @Test
    void transcribirCadenaVacia(){
       RNA_Transcription transcription = new RNA_Transcription();
       assertEquals("", transcription.transcribe("")); 
    }


    @Test
    void transcribe_G_DevuelveC(){
        RNA_Transcription transcriptor = new RNA_Transcription();
        assertEquals("C", transcriptor.transcribe("G"));
    }

    @Test
    void transcribir_C_DevuelveG(){
        RNA_Transcription transcriptor = new RNA_Transcription();
        assertEquals("G", transcriptor.transcribe("C"));
    }

    @Test
    void transcribir_T_DevuelveA(){
    RNA_Transcription transcriptor = new RNA_Transcription();
    assertEquals("A", transcriptor.transcribe("T"));
    }


    @Test
    void transcribir_A_DevuelveU(){
        RNA_Transcription transcriptor = new RNA_Transcription();
        assertEquals("U", transcriptor.transcribe("A"));
    }


    @Test
    void transcribir_GCTA_DevuelveCGAU() {
        RNA_Transcription transcriptor = new RNA_Transcription();
        assertEquals("CGAU", transcriptor.transcribe("GCTA"));
    }


    @Test
    void transcribir_ACGT_DevuelveUGCA() {
        RNA_Transcription transcriptor = new RNA_Transcription();
        assertEquals("UGCA", transcriptor.transcribe("ACGT"));
    }


    @Test
    void transcribir_NucleotidoInvalido_LanzaExcepcion() {
    RNA_Transcription transcriptor = new RNA_Transcription();
    assertThrows(IllegalArgumentException.class, () -> {
        transcriptor.transcribe("X");
    });
}
}
