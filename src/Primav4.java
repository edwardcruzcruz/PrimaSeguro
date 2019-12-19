import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

public class Primav4 {
	public static final Map<Integer,Float> FactorEdad = new HashMap<Integer, Float>();
    public static final Map<Integer,Integer> PtsAPerder = new HashMap<Integer, Integer>();
    public static final Map<Integer,Integer> ReducirSeguro = new HashMap<Integer, Integer>();
    
    static{
        FactorEdad.put(25,2.8F);
        FactorEdad.put(35,1.8F);
        FactorEdad.put(45,1.0F);
        FactorEdad.put(65,0.8F);
        FactorEdad.put(91,1.5F);
        
        PtsAPerder.put(25,1);
        PtsAPerder.put(35,3);
        PtsAPerder.put(45,5);
        PtsAPerder.put(65,7);
        PtsAPerder.put(91,5);
        
        ReducirSeguro.put(25,50);
        ReducirSeguro.put(35,50);
        ReducirSeguro.put(45,100);
        ReducirSeguro.put(65,150);
        ReducirSeguro.put(91,200);
        
    }
    
    public float prima(Object Edad, Object Puntos) {
    	float prima=0;
        int edad = 0;
        int puntos = 0;
        
        if(Edad instanceof Integer){        
            edad=(int)Edad;
        }else{
        
            System.out.println("Error, datos en Edad no validos, ingrese entero");
            return 0;
            
        }

        if(edad>17 && edad<91){
        	if(Puntos instanceof Integer){        
                puntos=(int)Puntos;
            }
        	else{
            
                System.out.println("Error, datos en Puntos no validos, ingrese entero");
                return 0;
            }
            
            
            if(puntos>0 && puntos<31){
                
                if(edad<25){
            
                    if(puntos>= 30-PtsAPerder.get(25)){

                        prima = 500  * FactorEdad.get(25) - ReducirSeguro.get(25);
                        System.out.print("Prima: $" + prima + "\n");

                    }
                    else{
                        prima = 500  * FactorEdad.get(25);
                        System.out.print("Prima: $" + prima + "\n");

                    }
            
                }
                
                else if(edad<35){
        
                    if(puntos>= 30-PtsAPerder.get(35)){

                        prima = 500  * FactorEdad.get(35) - ReducirSeguro.get(35);
                        System.out.print("Prima: $" + prima + "\n");

                    }
                    else{
                        prima = 500  * FactorEdad.get(35);
                        System.out.print("Prima: $" + prima + "\n");

                    }
                }

                else if (edad < 45 ){

                    if(puntos>= 30-PtsAPerder.get(45)){

                        prima = 500  * FactorEdad.get(45) - ReducirSeguro.get(45);
                        System.out.print("Prima: $" + prima + "\n");

                    }
                    else{
                        prima = 500  * FactorEdad.get(45);
                        System.out.print("Prima: $" + prima + "\n");

                    }
                }

                else if(edad<65) {

                    if(puntos>= 30-PtsAPerder.get(65)){

                        prima = 500  * FactorEdad.get(65) - ReducirSeguro.get(65);
                        System.out.print("Prima: $" + prima + "\n");

                    }
                    else{
                        prima = 500  * FactorEdad.get(65);
                        System.out.print("Prima: $" + prima + "\n");

                    }

                }

                else{

                    if(puntos>= 30-PtsAPerder.get(91)){

                        prima = 500  * FactorEdad.get(91) - ReducirSeguro.get(91);
                        System.out.print("Prima: $" + prima + "\n");

                    }
                    else{
                        prima = 500  * FactorEdad.get(91);
                        System.out.print("Prima: $" + prima + "\n");

                    }

                }
                
            }
            
            else{       
                
                System.out.println("Puntos fuera de rango");
            
            }
            
        }
        
        else{
        
            System.out.println("Edad fuera de rango");
        
        }
    	return prima;
    }
}
