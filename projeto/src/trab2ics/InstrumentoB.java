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
    public InstrumentoB(float duracao){
        random = new Random();
        ruidoAmplitude= new Ruido(random.nextFloat(), random.nextFloat(), random.nextFloat());

        ruidoFrequecia= new Ruido(random.nextFloat(), random.nextFloat(), random.nextFloat());

        osci= new Oscilador();
        
        osci.setDispositivoAmplitude(ruidoAmplitude);
        osci.setDispositivoFrequencia(ruidoFrequecia);

        setDuracao(duracao);
        osci.relogio();
        
    }
    
    public InstrumentoB(float duracao, float aA, float fA, float pA, float aF, float fF, float pF){
        random = new Random();
        ruidoAmplitude= new Ruido(aA, fA, pA);
 
        ruidoFrequecia= new Ruido(aF, fF, pF);
 
        osci= new Oscilador();
        
        osci.setDispositivoAmplitude(ruidoAmplitude);
        osci.setDispositivoFrequencia(ruidoFrequecia);

        setDuracao(duracao);
        osci.relogio();
        
    }


    public float ObterFreqRuidoAmplitude(){
        return ruidoAmplitude.getFrequencia();
    } 
    public float ObterFaseRuidoAmplitude(){
        return ruidoAmplitude.getFase();
    } 
    public float ObterDuracaoRuidoAmplitude(){
        return ruidoAmplitude.getDuracao();
    } 
    public float ObterGanhoRuidoAmplitude(){
        return ruidoAmplitude.getGanho();
    } 

    public float ObterFreqRuidoFrequecia(){
        return ruidoFrequecia.getFrequencia();
    } 
    public float ObterFaseRuidoFrequecia(){
        return ruidoFrequecia.getFase();
    } 
    public float ObterDuracaoRuidoFrequecia(){
        return ruidoFrequecia.getDuracao();
    } 
    public float ObterGanhoRuidoFrequecia(){
        return ruidoFrequecia.getGanho();
    } 

    public void SetFreqRuidoAmplitude(float valor){
        ruidoAmplitude.setFrequencia(valor);
    }
    public void SetFaseRuidoAmplitude(float valor){
        ruidoAmplitude.setFase(valor);
    }
    public void SetDuracaoRuidoAmplitude(float valor){
        ruidoAmplitude.setDuracao(valor);
    }
    public void SetGanhoRuidoAmplitude(float valor){
        ruidoAmplitude.setGanho(valor);
    }

    public void SetFreqRuidoFrequecia(float valor){
        ruidoFrequecia.setFrequencia(valor);
    }
    public void SetFaseRuidoFrequecia(float valor){
        ruidoFrequecia.setFase(valor);
    }
    public void SetDuracaoRuidoFrequecia(float valor){
        ruidoFrequecia.setDuracao(valor);
    }
    public void SetGanhoRuidoFrequecia(float valor){
        ruidoFrequecia.setGanho(valor);
    }
    
    public float obterSaida(){
        return osci.getSaida();
    }
    public float obterDuracaoOscilador(){
        return osci.getDuracao();
    }
    public float obterGanhoOscilador(){
        return osci.getGanho();
    }
    public float obterDuracao(){
        return osci.getDuracao();
    }

    @Override
 public final void setDuracao(float duracao){
        ruidoAmplitude.setDuracao(duracao);
        ruidoFrequecia.setDuracao(duracao);
        osci.setDuracao(duracao);
        duracao= duracao;
    }
}
