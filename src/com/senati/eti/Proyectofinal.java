package com.senati.eti;

import java.util.Scanner;
import java.util.Random;

public class Proyectofinal{

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		
		String[] arrCodigo = {"Z-1234","B-4567","C-7891","D-1111"};
		
		String[] arrNombre = {"Julio Mesicano","Franchesco Valladares","Dante Sembrera","Joe Castillo"};
		
		int[] arrDinero = {2600,3200,4000,3000};
		
		int[] arrContra = {7891,1101,2022,9990};
		
		
		
		System.out.println("------------------>Bienvenido a Nuestro Cajero <-----------------");
		System.out.println("");
        System.out.print("Numero de tarjeta...............:");
        String codigo = sc.nextLine();
        
        int p = -1;
        
        for (int x = 0 ; x < arrCodigo.length; x++) {
        	if(codigo.equals(arrCodigo[x])) {
        	   p =x;
        	   break;	
         
        		  				
        	}
        }
        
       
        if (p == -1) {
        	System.out.println("\n---------------------");
        	System.out.println("Tarjeta No registrada");
        	System.out.println("--------------------");
        	
        }
        else {
        	
        	int intento ,  veces = 0;
        	String continuar = "S";
        	do {
        		
        		System.out.print("Ingrese Clave de la Tarjeta.........: ");
    			intento = sc.nextInt();
    			if (intento==arrContra[p]) {
    		    while (continuar.equals("S") || continuar.equals("S")) {	
                  System.out.println("\nTarjeta.......: " + arrCodigo[p]);
        	      System.out.println("Cliente.......: " + arrNombre[p]);
        	     
        	      System.out.println("\n-------Cajero Bancario-------");
        	      System.out.println("1.[RETIRO]  ");
        	      System.out.println("2.[DEPOSITO]");
        	      System.out.println("3.[Transferencia]");
        	      System.out.println("4.[Pago de servicios]");
        	      System.out.println("5.[Prestamo]");
        	      System.out.println("6.[Consultas]");
        	      System.out.println("7.[Salir]");
        	      System.out.print("Ingrese opcion que desea llevar a cabo............");
        	      int op = sc.nextInt();
        	      
        	      
        	      String rpta1="" ;
        	      int rpta=0;
        	      Random MiAleatorio = new Random();
        	      int N = MiAleatorio.nextInt(2);
        	      
        	      
        	      switch(op) {
        	      case 1:
        	    	  System.out.println("Ingrese de que manera desea retirar :");
        	    	  System.out.println("1.Soles                      2.Dolares");
        	    	  System.out.print("Ingrese una opcion----");
        	    	  int retiro = sc.nextInt();
        	    	  
        	    	  switch(retiro) {
        	    	  case 1:
        	    		  if(N==0) {
        	    		  System.out.println("selecciono soles");
        	    		  System.out.println("------------------>DIA<------------------");
            	    	  System.out.println("Es de dia puedes retirar hasta 2500 soles ");	  
            	    	  System.out.println("Operacion eledia ---->Retiro<----");	
            	    	  System.out.println("1.-S/.200               4.-S/.800");
            	    	  System.out.println("2.-S/.400               5.-S/.1000");
            	    	  System.out.println("3.-S/.600               6.-S/.2500");
            	    	  System.out.print("Ingrese una opcion :");
            	    	  int op2 =sc.nextInt();
            	    	  
            	    	  int rptax = 0;
            	    	  
            	    	  
            	    	  switch(op2){
            	    	  case 1 :
            	    		 rptax = arrDinero[p]-200;
            	    		 break;
            	    	  case 2 :
            	    		 rptax = arrDinero[p]-400;
            	    		 break;
            	    	  case 3 :
            	    		 rptax = arrDinero[p]-600;
            	    		 break;
            	    	  case 4 :
            	    		 rptax = arrDinero[p]-800;
            	    		 break;
            	    	  case 5 :
            	    		 rptax = arrDinero[p]-1000;
            	    		 break;
            	    	  case 6 :
            	    		 rptax = arrDinero[p]-2500;
            	    		 break;
            	    	  	 
            	    		  
            	    	  }
            	    	  System.out.println("Su saldo es de -------->"+rptax);
        	    		  }
        	    		  
        	    		  else {
        	    		  System.out.println("------------------>Noche<----------------------");	  
            	    	  System.out.println("\nEs de noche solo puedes retirar hasta 500 soles");	
                    	  System.out.println("1.-S/. 50           4.S/.300");
                    	  System.out.println("2.-S/.100           5.S/.400");
                    	  System.out.println("3.-S/.200           6.S/.500");
                    	  System.out.print("Ingrese cuanto desea retirar : "); 
                    	  int op3 = sc.nextInt();
                    	  int rpta2x=0;
                    	  
                    	  switch (op3) {
                    	  case 1:
                    		  rpta2x= arrDinero[p]-50;
                    		  break;
                    	  case 2:
                    		  rpta2x= arrDinero[p]-100;
                    		  break;
                    	  case 3:
                    		  rpta2x = arrDinero[p]-200;
                    		  break;
                    	  case 4 :
                    		  rpta2x = arrDinero[p]- 300;
                    		  break;
                    	  case 5:
                    		  rpta2x = arrDinero[p]-400;
                    		  break;
                    	  case 6:
                    		  rpta2x = arrDinero[p]-500;
                    		  break;
                    	  
                    	  }
                    	  System.out.println("Su nuevo saldo ahora es de "+rpta2x);
        	    		  }
        	  
                    	  
        	    		  break;
        	    		  
        	    		  
   
        	    		  
    
        	    	  case 2:
        	    		  System.out.println("Usted Selecciono dolares");
        	    		  float rta = 0;
        	    		  if (N==0) {
        	    			  System.out.println("------------------DIA---------------");
        	    		      System.out.println("1.-$ 54                     4.-$ 215");
        	    		      System.out.println("2.-$ 108                    5.-$ 268");      	 	      		
        	    		      System.out.println("3.-$ 160                    6.-$ 670");
        	    		      System.out.println("              7.-Salir              ");
        	    		      System.out.print("Ingrese opcion de lo que desea retirar...");
        	    		      int op3 = sc.nextInt();
        	    		      
        	    		      float dolar = (arrDinero[p]/3.73f);
        	    		      
        	    		      switch(op3) {
        	    		      case 1:
        	    		    	  rta =dolar-54;
        	    		    	  break;
        	    		      case 2:
        	    		    	  rta = dolar-108;
        	    		    	  break;
        	    		      case 3:
        	    		    	  rta = dolar -160;
        	    		    	  break;
        	    		      case 4:
        	    		    	  rta = dolar -215;
        	    		    	  break;
        	    		      case 5:
        	    		    	  rta = dolar -268;
        	    		    	  break;
        	    		      case 6:
        	    		    	  rta =dolar - 670;
        	    		    	  break;
        	    		      case 7:
        	    		    	  System.out.println("No se hizo ningun retiro , usted salio");
        	    		          break;
        	    		    	  
        	    		      }
        	    		      System.out.println("Su saldo en dolares ($) ahora es de "+rta);
        	    		  }
        	    		  
        	    		  else {
        	    			  System.out.println("---------------Noche-------------");
        	    		      System.out.println("1.-$ 13             4.-$ 80 ");
        	    		      System.out.println("2.-$ 27             5.-$ 107");
        	    		      System.out.println("3.-$ 54             6.-$ 135");
        	    		      System.out.println("          7.-Salir          ");
        	    		      System.out.print("Ingrese opcion..........>");
        	    		      int op4 = sc.nextInt();
        	    		      
        	    		      float dolar = (arrDinero[p]/3.73f);
        	    		      switch(op4) {
        	    		      case 1:
        	    		    	  rta=dolar-13;
        	    		    	  break;
        	    		      case 2:
        	    		    	  rta = dolar-27;
        	    		    	  break;
        	    		      case 3:
        	    		    	  rta= dolar -54;
        	    		    	  break;
        	    		      case 4:
        	    		    	  rta = dolar -80;
        	    		    	  break;
        	    		      case 5:
        	    		    	  rta = dolar - 107;
        	    		    	  break;
        	    		      case 6:
        	    		    	  rta=dolar-134;
        	    		    	  break;
        	    		      case 7:
        	    		    	  System.out.println("Salio del retiro , no se hizo ningun retiro");
        	    		    	  break;
        	    		      }
        	    		      System.out.println("Su saldo en dolares ($) ahora es de "+rta);
        	    		  } 
        	    		  
        	    		 break;
        	    		 
        	    	  }
        	    	  
        	    	  
        	    	  
        
        	    	  
        	    	  
        	    	  break;
        	    	  
        	    	  
        	    	  
        	    	  
        	    	  
        	    	  
        	    	  
        	    	  
        	
        	    	  
        	    	  
        	    	  
        	      case 2:
        	    	  System.out.println("\n");
        	    	  System.out.println("\t Monto minimo para depositar 20");
        	    	  System.out.println("\t Monto maximo para depositar 2000");
        	    	  System.out.print("\nIngrese cuanto desea depositar :");
        	    	  
        	    	  int deposito = sc.nextInt();
        	    	  
        	    	  if (deposito>=20 && deposito<=2000) {
        	    	     rpta=arrDinero[p]+deposito;
        	    	     System.out.println("Usted ha hecho un deposito de......"+deposito);
        	    	     System.out.println("\nSu nuevo saldo ahora es de-------> "+rpta);
        	    	     System.out.println("Que tenga un bonito dia !");}
        	    	  else {
        	    		  System.out.println("Se le indica que el deposito minimo es de 20 y el maximo de 2000 soles");
        	    		  System.out.print("Ingrese de nuevo........");
        	    		  int reitero=sc.nextInt();
        	    		  
        	    		  
        	    		  if (reitero>=20 && reitero<=2000) {
        	    			  rpta=arrDinero[p]+reitero;
        	    		      System.out.println("Deposito hecho con exito "+ rpta);}
        	    		  else {
        	    			  
        	    		      System.out.println("\n");
        	    		      System.out.println("PROGRAMA TERMINADO");}
        	    		  }
        	    	  break; 
        	    	  
        	      case 3 :
        	    	  
        	          String continuar1 = "S";
        	         
        	          sc.nextLine();
        	          System.out.print("Ingrese cuenta a transferir........:");
        	          String cuenta = sc.nextLine();
        	          
        	          System.out.print("Ingrese monto................");
        	          int monto = sc.nextInt();
        	          
        	          
        	          if (cuenta.equals(arrCodigo[1])) { 
                	  System.out.println("Persona en uso de la cuenta " + arrNombre[1]); 
        	          System.out.println("Monto a transferir "+monto);
        	           
        	          sc.nextLine();
        	          System.out.println("¿Desea confirmar? <S/N> :");
        			  continuar1=sc.nextLine();
        			  
        			  if (continuar1.equals("S")) {
        				  System.out.println("Ingrese cuenta.......");
        			      String cuenta1 = sc.nextLine();
        			      
        			      System.out.println("Ingrese contraseña------");
        			      int contra1 = sc.nextInt();
        			      
        			      if (cuenta.equals(arrCodigo[1])&& contra1==1101) {
        			    	  System.out.println("Bienvenido");
        			          System.out.println("1.Ver saldo         2.Salir");
        			          System.out.println("Ingrese operacion.........");
        			          int opera = sc.nextInt();
        			          
        			          int respuesta = 0;
        			          
        			          switch (opera) {
        			          case 1:
        			        	  respuesta=arrDinero[1]+monto;
        			        	  System.out.println("Saldo anterior"+arrDinero[1]);
        			        	  System.out.println("Saldo actual"+respuesta);
        			        	  break;
        			          case 2:
        			        	  System.out.println("Cerrando sesion");
        			           }
        			          
        		
        			         }
        			      else
        			    	  System.out.println("CUENTA NO ENCONTRADA");
        			      }   
        			    	  
        			  
        			  else {
        				  System.out.println("Gracias por usar la opcion 3 ");}
        			      
        	          }   
        			  
        	          
        	          
        	      
        	    	  
        	    	  break;
                      
                   
        	      
        	    	  
        	      case 4 :
        	    	  Random aleatorio = new Random();
        	  		  int Agua = aleatorio.nextInt(200 - 180 + 1)+180;
        	  		  
        	  		  
        	  		  Random aleatorio2 = new Random();
      	  		      int Luz = aleatorio2.nextInt(90 - 50 + 1)+50;
      	  		      
      	  		      
      	  		      Random aleatorio3 = new Random();
    	  		      int Internet = aleatorio3.nextInt(40 - 38 + 1)+38;
    	  		      
    		      
      	  		      
        	    	  System.out.println("----------Aqui pago de servicios------");
        	    	  System.out.println("1-Luz        2.-Agua       3.-Internet");
        	    	  System.out.println("Ingrese el servicio que desea pagar ");
        	    	  int servicios = sc.nextInt();
        	    	  
        	    	  int pago = 0;
        	    	  
        	    	  switch (servicios) {
        	    	  
        	    	  case 1:
        	    		  System.out.println("Monto a pagar de la LUZ  es  "+ Luz);
        	    		  
        	    		  sc.nextLine();
        	    		  
        	    		  System.out.println("Desea cancelar ? S/N");
        	    		  String confirm = sc.nextLine();
        	    		  
        	    		  
        	    		  
        	    		  if (confirm.equals("S")) {
        	    		   pago = arrDinero[p]-Luz;
        	    		   System.out.println("Se cancelo el monto de Luz ");
        	    		   System.out.println("Tu saldo es de "+pago);}
        	    		  else {
        	    			  System.out.println("No se cancelo");}
        	    		  
        	    		  break;
        	    		  
        	    	  case 2:
        	    		  System.out.println("Monto a pagar del Agua es " + Agua);
        	    		  
        	    		  sc.nextLine();
        	    		  
        	    		  System.out.println("Desea cancelar ? S/N");
        	    		  String confirm2 = sc.nextLine();
        	    		  
        	    		  if (confirm2.equals("S")) {
        	    			  pago= arrDinero[p]-Agua;
        	    		      System.out.println("Se cancelo el monto de agua");
        	    		      System.out.println("Tu saldo es de "+pago);}
        	    		  else {
        	    			  System.out.println("No se cancelo");}
     
        	    		  break;
        	    	  case 3:
        	    		  System.out.println("Monto a pagar del internet " +Internet);
        	    		  
        	    		  sc.nextLine();
        	    		  
        	    		  System.out.println("Desea cancelar ? S/N");
        	    		  String confirm3 = sc.nextLine();
        	    		  
        	    		  if (confirm3.equals("S")) {
        	    			  pago = arrDinero[p]-Internet;
        	    			  System.out.println("Se cancelo el monto del internet");
        	    			  System.out.println("Tu saldo es de "+pago);}
        	    		  else {
        	    			  System.out.println("No se cancelo");
        	    		  }
        	    			  
        	    		  
        	    	  }
        	    	  break;
        	    	  
        	      case 5:
        	    	  System.out.println("Prestamo");
        	    	  System.out.println("Selecciona el prestamo que deseas :");
        	    	  System.out.println("El banco puede otorgarle un prestamo de:");
        	    	  System.out.println("1-S/.3000                      2.-S/4000");       
        	    	  System.out.println("Elija.............");
        	    	  int cf = sc.nextInt();
        	    	  
        	    	  int validacion = 0;
        	    	  
        	    	  switch (cf) {
        	    	  case 1:
        	    		  System.out.println("Prestamo elegido 3000 soles");
        	    		  System.out.println("1.-15 Cuotas     2.- 24Cuotas");
        	    		  System.out.println("Como desea cancelarlo ?");
        	    		  int cancel = sc.nextInt();
        	    		  switch(cancel) {
        	    		  case 1:
        	    			  validacion = arrDinero[p]+3000;
        	    			  System.out.println("Se hizo el prestamo 15 cuotas");
        	    			  System.out.println("Prestamo de........3000 soles");
        	    			  System.out.println("Saldo nuevo......."+validacion);
        	    			  break;
        	    		  case 2:
        	    			  validacion = arrDinero[p]+3000;
        	    			  System.out.println("Se hizo el prestamo 24 cuotas");
        	    			  System.out.println("Prestamo de........3000 soles");
        	    			  System.out.println("Saldo nuevo......."+validacion);
        	    			  break;
        	    		  default:
        	    			  System.out.println("No se eligio  ninguna opcion");
        	    		  }
        	    		  break;
        	    		  
        	    	  case 2:
        	    		  System.out.println("Prestamo elegido 4000 soles");
        	    		  System.out.println("1.-15 Cuotas     2.- 24Cuotas");
        	    		  System.out.println("Como desea cancelarlo ?");
        	    		  int cancel2 = sc.nextInt();
        	    		  switch(cancel2) {
        	    		  case 1:
        	    			  validacion = arrDinero[p]+4000;
        	    			  System.out.println("Se hizo el prestamo 15 cuotas");
        	    			  System.out.println("Prestamo de........4000 soles");
        	    			  System.out.println("Saldo nuevo......."+validacion);
        	    			  break;
        	    		  case 2:
        	    			  validacion = arrDinero[p]+4000;
        	    			  System.out.println("Se hizo el prestamo 24 cuotas");
        	    			  System.out.println("Prestamo de........4000 soles");
        	    			  System.out.println("Saldo nuevo......."+validacion);
        	    			  break;
        	    		  }
        	    		  break;
        	    	  }
        	    	  break;
        	    	  
        	      case 6:
        	    	  System.out.println("\n[----->Ha seleccionado la opcion de consultas<-----]");
        	    	  System.out.println("[            Indiquenos su consulta                ]");
        	    	  System.out.println("1.Ver saldo             \t2.Valor del dolar ");
        	    	  System.out.println("3.Ver datos ");
        	    	  System.out.print("Seleccione una opcion-------------->"); 
        	    	  int ver = sc.nextInt();
        	    	  
        	    	  int rp=0;
        	    	  
        	    	  switch (ver) {
        	    	  case 1:
        	    		  rp=arrDinero[p];
        	    		  System.out.println("Tiene un saldo de---------->"+rp);
        	    		  break;
        	    	  case 2:
        	    		  System.out.println("El dolar tiene un valor de 3.73 soles");
        	    		  break;
        	    	  case 3:
        	    		  System.out.println("Su Tarjeta es-----------> " + arrCodigo[p]);
                	      System.out.println("Cliente registrado------> " + arrNombre[p]);
                	      System.out.println("Contraseña--------------> " + arrContra[p]);
        	    		  break;
        	    	  }
        	    	 break;
        	      case 7:
        	    	  System.out.println("Gracias");
        	    	  break;
        	    	  
        	    		 
              	  }
        	      sc.nextLine();	  
        	    		 	  
        	      System.out.print("¿Desea Continuar......? <S/N> :");
  	  			  continuar=sc.nextLine(); 
        	      }
    		     System.out.println("Retire su tarjeta----->Gracias por su preferencia ");
        	      
        	      veces=3;}
    			else {
    				System.out.println("Contraseña incorrecta");
    			    veces=veces+1;
    			    if (veces==3) {System.out.println("\nBloqueando Tarjeta.........");
    			    System.out.println("Tarjeta Bloqueada !!");}
    			}
    			
            }while(veces<3);
        
        	
        
        
        }
        
        
     
	}

}