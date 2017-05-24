/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trab2ics;
import sintese.*;
import java.util.Random;
/**
 *
 * @author francisco
 */
public class InstrumentoB extends sintese.Dispositivo {
    Oscilador osci;
    Ruido ruidoAmplitude;
    Ruido ruidoFrequecia;
    
    Random random;
    InstrumentoB(float duracao){
        random = new Random();
        ruidoAmplitude= new Ruido(random.nextFloat(), random.nextFloat(), random.nextFloat());
        ruidoAmplitude.setDuracao(duracao);

        ruidoFrequecia= new Ruido(random.nextFloat(), random.nextFloat(), random.nextFloat());
        ruidoFrequecia.setDuracao(duracao);

        osci= new Oscilador();
        
        osci.setDispositivoAmplitude(ruidoAmplitude);
        osci.setDispositivoFrequencia(ruidoFrequecia);

        osci.setDuracao(duracao);
        osci.relogio();
        
    }
    
    InstrumentoB(float duracao, float aA, float fA, float pA, float aF, float fF, float pF){
        random = new Random();
        ruidoAmplitude= new Ruido(aA, fA, pA);
        ruidoAmplitude.setDuracao(duracao);

        ruidoFrequecia= new Ruido(aF, fF, pF);
        ruidoFrequecia.setDuracao(duracao);

        osci= new Oscilador();
        
        osci.setDispositivoAmplitude(ruidoAmplitude);
        osci.setDispositivoFrequencia(ruidoFrequecia);

        osci.setDuracao(duracao);
        osci.relogio();
        
    }


    float ObterFreqRuidoAmplitude(){
        return ruidoAmplitude.getFrequencia();
    } 
    float ObterFaseRuidoAmplitude(){
        return ruidoAmplitude.getFase();
    } 
    float ObterDuracaoRuidoAmplitude(){
        return ruidoAmplitude.getDuracao();
    } 
    float ObterGanhoRuidoAmplitude(){
        return ruidoAmplitude.getGanho();
    } 

    float ObterFreqRuidoFrequecia(){
        return ruidoFrequecia.getFrequencia();
    } 
    float ObterFaseRuidoFrequecia(){
        return ruidoFrequecia.getFase();
    } 
    float ObterDuracaoRuidoFrequecia(){
        return ruidoFrequecia.getDuracao();
    } 
    float ObterGanhoRuidoFrequecia(){
        return ruidoFrequecia.getGanho();
    } 

    void SetFreqRuidoAmplitude(float valor){
        ruidoAmplitude.setFrequencia(valor);
    }
    void SetFaseRuidoAmplitude(float valor){
        ruidoAmplitude.setFase(valor);
    }
    void SetDuracaoRuidoAmplitude(float valor){
        ruidoAmplitude.setDuracao(valor);
    }
    void SetGanhoRuidoAmplitude(float valor){
        ruidoAmplitude.setGanho(valor);
    }

    void SetFreqRuidoFrequecia(float valor){
        ruidoFrequecia.setFrequencia(valor);
    }
    void SetFaseRuidoFrequecia(float valor){
        ruidoFrequecia.setFase(valor);
    }
    void SetDuracaoRuidoFrequecia(float valor){
        ruidoFrequecia.setDuracao(valor);
    }
    void SetGanhoRuidoFrequecia(float valor){
        ruidoFrequecia.setGanho(valor);
    }
    
    float obterSaida(){
        return osci.getSaida();
    }
    float obterDuracaoOscilador(){
        return osci.getDuracao();
    }
    float obterGanhoOscilador(){
        return osci.getGanho();
    }
    float obterDuracao(){
        return osci.getDuracao();
    }

    void setduracao(float duracao){
        ruidoAmplitude.setDuracao(duracao);
        ruidoFrequecia.setDuracao(duracao);
        osci.setDuracao(duracao);
    }
}
