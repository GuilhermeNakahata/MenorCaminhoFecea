
package menorcaminhofecea3;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

public class Mapa extends javax.swing.JFrame {
int a = 0, b = 0,c = 0, busca = 0;
float distancebt = 0;  
    public Mapa() {
        initComponents();
        Centralize();     
        clean();
        
      
    }
 public void clean(){
      JLabel[] Caminhos = {ru,caminho105,Sala42,Sala41,
Sala40,Sala39,Sala38,Sala36,Sala34,
Sala32,caminho106,Sala49,Banheiro81,Sala47,
Sala31,Sala46,Sala30,Brinquedoteca,sala28,
sala27,sala26,sala25,banheiro83,helidbudian,
caminho95,sala14,sala15,sala16,banheiro82,
sala17,sala24,sala10,sala8,sala7,
sala6,Sala50,caminho96,caminho103,Caminho88,
Sala52,Sala45,Xerox,Sala53,Sala54,
Sala55,Sala56,Sala57,Caminho90,Sala59,
pós,Sala60,Sala62,Sala61,caminho104,
cepese,caminho110,gralha,sala18,sala23,
banheiro,sala22,sala21,caminho122,sala20,
sala68,sala69,sala70,grafica,museu,
fundosdce,sala64,sala63,caminho113,caminho119,
caminho120,caminho123,sala65,sala66,sala67,
Sala44,Cozinha,Caminho91,Caminho92,Sala58,
Caminho89,Caminho93,Sala51,caminho107,auditorioberton,
caminho102,biblioteca,almoxarifado,caminho111,caminho112,
direcao,coordenacao,caminho98,caminho97,caminho94,
caminho99,caminho100,caminho101,caminho108,sala13,
banheiro84,caminho115,dce,caminho116,caminho114,
caminho117,caminho118,caminho125,caminho121,
sala19,caminho124,caminho109,caminho127,
caminho112,caminho126,ficharu,ceetur,caminho86     
      };
      ImageIcon imagem = new ImageIcon(Mapa.class.getResource("/Imagens/Branco.png"));
      for(int i = 0; i < Caminhos.length; i++){ 
          Image imag = imagem.getImage().getScaledInstance(Caminhos[i].getWidth(), Caminhos[i].getHeight(), Image.SCALE_DEFAULT);
          Caminhos[i].setIcon(new ImageIcon(imag));
      }
     
      Entrada.setText("");
      Saida.setText("");
      Distancia.setText("");
      distancebt = 0;
     
 }
  public void Geographic_Coordinates(int a, int b){
      Graph g = new Graph();
          int cont = 0;
          float distance = 0;
          int[] aux = new int[999]; 
          ImageIcon imagem = new ImageIcon(Mapa.class.getResource("/Imagens/mono-red-ball.png"));
      JLabel[] Caminhos = {ru,caminho105,Sala42,Sala41,
Sala40,Sala39,Sala38,Sala36,Sala34,
Sala32,caminho106,Sala49,Banheiro81,Sala47,
Sala31,Sala46,Sala30,Brinquedoteca,sala28,
sala27,sala26,sala25,banheiro83,helidbudian,
caminho95,sala14,sala15,sala16,banheiro82,
sala17,sala24,sala10,sala8,sala7,
sala6,Sala50,caminho96,caminho103,Caminho88,
Sala52,Sala45,Xerox,Sala53,Sala54,
Sala55,Sala56,Sala57,Caminho90,Sala59,
pós,Sala60,Sala62,Sala61,caminho104,
cepese,caminho110,gralha,sala18,sala23,
banheiro,sala22,sala21,caminho122,sala20,
sala68,sala69,sala70,grafica,museu,
fundosdce,sala64,sala63,caminho113,caminho119,
caminho120,caminho123,sala65,sala66,sala67,
Sala44,Cozinha,Caminho91,Caminho92,Sala58,
Caminho89,Caminho93,Sala51,caminho107,auditorioberton,
caminho102,biblioteca,almoxarifado,caminho111,caminho112,
direcao,coordenacao,caminho98,caminho97,caminho94,
caminho99,caminho100,caminho101,caminho108,sala13,
banheiro84,caminho115,dce,caminho116,caminho114,
caminho117,caminho118,caminho125,caminho121,
sala19,caminho124,caminho109,caminho127,
caminho112,caminho126,ficharu,ceetur,caminho86   
      };
// Inicio Terreo                
//Caminho RU (1) até a Pós (77)

g.addVertex(71, Arrays.asList(new Vertex(1, 1960)));
g.addVertex(1, Arrays.asList(new Vertex(105, 320), new Vertex(71,1960)));
g.addVertex(105, Arrays.asList(new Vertex(1, 320), new Vertex(79,430), new Vertex(72,1080)));
g.addVertex(79, Arrays.asList(new Vertex(105, 430), new Vertex(106,1100)));
g.addVertex(106, Arrays.asList(new Vertex(79, 1100), new Vertex(107,850),new Vertex(48,1650)));
g.addVertex(107, Arrays.asList(new Vertex(106, 850), new Vertex(81,230)));
g.addVertex(81, Arrays.asList(new Vertex(107, 230), new Vertex(47,680)));
g.addVertex(47, Arrays.asList(new Vertex(81, 680), new Vertex(46,458)));
g.addVertex(46, Arrays.asList(new Vertex(47, 458), new Vertex(89,608)));
g.addVertex(89, Arrays.asList(new Vertex(46, 608), new Vertex(88,1500), new Vertex(93,1383), new Vertex(45,820)));
g.addVertex(45, Arrays.asList(new Vertex(89, 820), new Vertex(44,830)));
g.addVertex(44, Arrays.asList(new Vertex(45, 830), new Vertex(78,1400)));
g.addVertex(78, Arrays.asList(new Vertex(44, 1400), new Vertex(43,100)));
g.addVertex(43, Arrays.asList(new Vertex(78, 100), new Vertex(77,510), new Vertex(31,1026)));
g.addVertex(77, Arrays.asList(new Vertex(43, 510), new Vertex(116,1540))); 

if(cadeirante.isSelected()){
   g.addVertex(77, Arrays.asList(new Vertex(43, 510))); 
}

// Mini corredor Berton

g.addVertex(48, Arrays.asList(new Vertex(49, 150), new Vertex(106,1650))); 
g.addVertex(49, Arrays.asList(new Vertex(48, 150), new Vertex(50,780)));
g.addVertex(50, Arrays.asList(new Vertex(49, 780), new Vertex(51,915)));
g.addVertex(51, Arrays.asList(new Vertex(50, 915), new Vertex(88,565)));
g.addVertex(88, Arrays.asList(new Vertex(51, 565), new Vertex(89,1500), new Vertex(52,350)));
g.addVertex(52,Arrays.asList(new Vertex(88, 350),new Vertex(53, 920)));
g.addVertex(53,Arrays.asList(new Vertex(52, 920),new Vertex(54, 920)));
g.addVertex(54,Arrays.asList(new Vertex(53, 920),new Vertex(55, 930)));
g.addVertex(55,Arrays.asList(new Vertex(54, 930),new Vertex(56, 930)));
g.addVertex(56,Arrays.asList(new Vertex(55, 930),new Vertex(57, 920)));
g.addVertex(57,Arrays.asList(new Vertex(56, 920),new Vertex(58, 130)));
g.addVertex(58,Arrays.asList(new Vertex(57, 130),new Vertex(90, 10)));
g.addVertex(90,Arrays.asList(new Vertex(58, 10),new Vertex(91, 870), new Vertex(113,885)));

if(cadeirante.isSelected()){
    g.addVertex(90,Arrays.asList(new Vertex(58, 10),new Vertex(91, 870)));
}
g.addVertex(91,Arrays.asList(new Vertex(90, 870),new Vertex(92, 200)));
g.addVertex(92,Arrays.asList(new Vertex(91, 200),new Vertex(59, 720)));
g.addVertex(59,Arrays.asList(new Vertex(92, 720),new Vertex(60, 720)));
g.addVertex(60,Arrays.asList(new Vertex(59, 720),new Vertex(61, 720)));
g.addVertex(61,Arrays.asList(new Vertex(60, 720),new Vertex(62, 700)));
g.addVertex(62,Arrays.asList(new Vertex(61, 700)));

// Corredor escuro


g.addVertex(38,Arrays.asList(new Vertex(93, 180),new Vertex(39, 790)));
g.addVertex(39,Arrays.asList(new Vertex(38, 790),new Vertex(40, 170)));
g.addVertex(40,Arrays.asList(new Vertex(39, 170),new Vertex(42, 800)));
g.addVertex(42,Arrays.asList(new Vertex(40, 800),new Vertex(41, 160)));
g.addVertex(41,Arrays.asList(new Vertex(42, 160)));
g.addVertex(93,Arrays.asList(new Vertex(38, 180),new Vertex(89, 1383), new Vertex(36,1010), new Vertex(103,1180))); 
g.addVertex(36,Arrays.asList(new Vertex(93, 1010),new Vertex(34, 970)));
g.addVertex(34,Arrays.asList(new Vertex(36, 970),new Vertex(32, 170)));
g.addVertex(32,Arrays.asList(new Vertex(34, 170), new Vertex(30,1020)));

// Corredor Grupo de jogos

g.addVertex(31,Arrays.asList(new Vertex(43, 1026),new Vertex(30, 580)));
g.addVertex(30,Arrays.asList(new Vertex(31, 580),new Vertex(32, 1020), new Vertex(29,550)));
g.addVertex(29,Arrays.asList(new Vertex(30, 550),new Vertex(28, 695)));
g.addVertex(28,Arrays.asList(new Vertex(29, 695),new Vertex(83,506), new Vertex(27,720)));
g.addVertex(27,Arrays.asList(new Vertex(28, 720),new Vertex(26, 1420)));
g.addVertex(26,Arrays.asList(new Vertex(27, 1420),new Vertex(25, 140)));
g.addVertex(25,Arrays.asList(new Vertex(26, 140), new Vertex(94,1480)));
g.addVertex(94,Arrays.asList(new Vertex(25, 1480),new Vertex(10,1540), new Vertex(11,650), new Vertex(99,1700)));   

// Corredor DIDI 

g.addVertex(83,Arrays.asList(new Vertex(28, 506),new Vertex(102,1090)));
g.addVertex(102,Arrays.asList(new Vertex(103, 590), new Vertex(83,1090), new Vertex(2,1020)));
g.addVertex(103,Arrays.asList(new Vertex(102, 590),new Vertex(73, 2660), new Vertex(93,1180)));
g.addVertex(73,Arrays.asList(new Vertex(103, 2660), new Vertex(104,800)));

// Corredor do banco da Sara

g.addVertex(72, Arrays.asList(new Vertex(105, 1080), new Vertex(104,1205)));
g.addVertex(104, Arrays.asList(new Vertex(72, 1205), new Vertex(73,800), new Vertex(109,3750)));
g.addVertex(109, Arrays.asList(new Vertex(104, 3750), new Vertex(110,1000), new Vertex(108,1825))); 
g.addVertex(110, Arrays.asList(new Vertex(109, 1000), new Vertex(4,300)));
g.addVertex(4,Arrays.asList(new Vertex(110, 300),new Vertex(111, 500)));
g.addVertex(111,Arrays.asList(new Vertex(4, 500), new Vertex(127,2700)));

// Corredor Matematica

g.addVertex(10,Arrays.asList(new Vertex(94, 1540),new Vertex(8, 790)));
g.addVertex(8,Arrays.asList(new Vertex(10, 790),new Vertex(7, 140)));
g.addVertex(7,Arrays.asList(new Vertex(8, 140),new Vertex(96, 770)));
g.addVertex(96,Arrays.asList(new Vertex(7, 770),new Vertex(6,230), new Vertex(97, 728), new Vertex(98,730))); 
g.addVertex(6,Arrays.asList(new Vertex(96, 230)));

// Corredor PBID

g.addVertex(11,Arrays.asList(new Vertex(94, 650),new Vertex(13, 1240)));
g.addVertex(13,Arrays.asList(new Vertex(11, 1240),new Vertex(95, 277)));
g.addVertex(95,Arrays.asList(new Vertex(13, 277),new Vertex(14, 730), new Vertex(15,270)));
g.addVertex(14,Arrays.asList(new Vertex(95, 730)));
g.addVertex(15,Arrays.asList(new Vertex(95, 270),new Vertex(16, 780)));
g.addVertex(16,Arrays.asList(new Vertex(15, 780),new Vertex(82, 383)));
g.addVertex(82,Arrays.asList(new Vertex(16, 383),new Vertex(17, 229), new Vertex(124,1150)));

if(cadeirante.isSelected()){
    g.addVertex(82,Arrays.asList(new Vertex(16, 383),new Vertex(17, 229)));
}
g.addVertex(17,Arrays.asList(new Vertex(82, 229),new Vertex(18, 830)));
g.addVertex(18,Arrays.asList(new Vertex(17, 830)));
g.addVertex(108,Arrays.asList(new Vertex(99, 1825),new Vertex(109, 1825)));

// Corredor biblioteca

g.addVertex(2,Arrays.asList(new Vertex(102, 1020),new Vertex(3, 140)));
g.addVertex(3,Arrays.asList(new Vertex(2, 140),new Vertex(101, 1140)));
g.addVertex(101,Arrays.asList(new Vertex(3, 1140),new Vertex(100, 250)));
g.addVertex(100,Arrays.asList(new Vertex(101, 250),new Vertex(99, 1020)));
g.addVertex(99,Arrays.asList(new Vertex(100, 1020),new Vertex(98, 1187), new Vertex(94,1700), new Vertex(108,1825)));
g.addVertex(98,Arrays.asList(new Vertex(99, 1020),new Vertex(96, 730), new Vertex(123,3000)));
g.addVertex(97,Arrays.asList(new Vertex(96, 728), new Vertex(126,1020)));

if(cadeirante.isSelected()){
    g.addVertex(97,Arrays.asList(new Vertex(96, 728)));
}

// Inicio Subsolo
// Corredor Fagi in Law


g.addVertex(113, Arrays.asList(new Vertex(63, 130), new Vertex(90,885)));

if(cadeirante.isSelected()){
    g.addVertex(113, Arrays.asList(new Vertex(63, 130)));    
}
g.addVertex(63, Arrays.asList(new Vertex(113, 130), new Vertex(114,280)));
g.addVertex(114, Arrays.asList(new Vertex(63, 280), new Vertex(64,400), new Vertex(84,1120)));
g.addVertex(64, Arrays.asList(new Vertex(114, 400), new Vertex(65,740)));
g.addVertex(65, Arrays.asList(new Vertex(64, 740), new Vertex(66,725)));
g.addVertex(66, Arrays.asList(new Vertex(65, 725), new Vertex(67,690)));
g.addVertex(67, Arrays.asList(new Vertex(66, 690)));

// Corredor da Corrida do milênio

g.addVertex(84, Arrays.asList(new Vertex(114, 1120), new Vertex(115,720)));
g.addVertex(115, Arrays.asList(new Vertex(84, 720), new Vertex(5,635), new Vertex(76,2940)));
g.addVertex(76, Arrays.asList(new Vertex(115, 2940), new Vertex(117,1150)));
g.addVertex(117, Arrays.asList(new Vertex(76, 1150), new Vertex(118,2290), new Vertex(119,1000))); 
g.addVertex(119, Arrays.asList(new Vertex(117, 1000), new Vertex(120,1190)));

// Corredor DCE

g.addVertex(5, Arrays.asList(new Vertex(115, 635), new Vertex(116,300)));
g.addVertex(116, Arrays.asList(new Vertex(5, 300), new Vertex(77,1540)));

if(cadeirante.isSelected()){
    g.addVertex(116, Arrays.asList(new Vertex(5, 300)));
}

// Corredor museu

g.addVertex(74, Arrays.asList(new Vertex(75, 1850)));
g.addVertex(75, Arrays.asList(new Vertex(74, 1850), new Vertex(118,610)));
g.addVertex(118, Arrays.asList(new Vertex(75, 610), new Vertex(117,2290), new Vertex(121,1000)));
g.addVertex(121, Arrays.asList(new Vertex(118, 1000), new Vertex(120,1020), new Vertex(123,1800)));
g.addVertex(123, Arrays.asList(new Vertex(121, 1800), new Vertex(124,370), new Vertex(98,3000), new Vertex(19,1000)));
g.addVertex(124, Arrays.asList(new Vertex(123, 370), new Vertex(125,1890), new Vertex(82,1150)));

if(cadeirante.isSelected()){
    g.addVertex(124, Arrays.asList(new Vertex(123, 370), new Vertex(125,1890)));
}

// Corredor que a Sara dobrou a mangueira

g.addVertex(120, Arrays.asList(new Vertex(121, 1020), new Vertex(119,1190), new Vertex(69,210), new Vertex(20,291)));
g.addVertex(69, Arrays.asList(new Vertex(120, 210), new Vertex(68,100), new Vertex(70,10)));
g.addVertex(70, Arrays.asList(new Vertex(69, 10)));
g.addVertex(68, Arrays.asList(new Vertex(69, 100)));

// Corredor da sala da conversa

g.addVertex(20, Arrays.asList(new Vertex(120, 291), new Vertex(122,720)));
g.addVertex(122, Arrays.asList(new Vertex(20, 720), new Vertex(19,950), new Vertex(21,255)));
g.addVertex(21, Arrays.asList(new Vertex(122, 255), new Vertex(22,767)));
g.addVertex(22, Arrays.asList(new Vertex(21, 767), new Vertex(85,381)));
g.addVertex(85, Arrays.asList(new Vertex(22, 381), new Vertex(23,300)));
g.addVertex(23, Arrays.asList(new Vertex(85, 300), new Vertex(24,840)));
g.addVertex(24, Arrays.asList(new Vertex(23, 840)));
g.addVertex(19, Arrays.asList(new Vertex(123, 1000), new Vertex(122,950)));

// Corredor Gralha

g.addVertex(125, Arrays.asList(new Vertex(124, 1890), new Vertex(86,1404)));
g.addVertex(86, Arrays.asList(new Vertex(125, 1404), new Vertex(126,1404)));
g.addVertex(126, Arrays.asList(new Vertex(86, 1404), new Vertex(112,2480), new Vertex(97,1020)));

if(cadeirante.isSelected()){
    g.addVertex(126, Arrays.asList(new Vertex(86, 1404), new Vertex(112,2480)));
}
g.addVertex(112, Arrays.asList(new Vertex(126, 2480), new Vertex(127,2480)));
g.addVertex(127, Arrays.asList(new Vertex(112, 2480), new Vertex(80,1760), new Vertex(111,2700)));
g.addVertex(80, Arrays.asList(new Vertex(127, 1760)));

                List<Integer> chars = new ArrayList<>();
                for (int c : (g.getShortestPath(a,b))) {
                chars.add(c);
                cont++;
                }
                for(int i = 0; i < Caminhos.length; i++){
                if(a == Integer.parseInt(Caminhos[i].getText())){
                      Image imag = imagem.getImage().getScaledInstance(Caminhos[i].getWidth(), Caminhos[i].getHeight(), Image.SCALE_DEFAULT);
                    Caminhos[i].setIcon(new ImageIcon(imag));
                    break;
                }
                }
                
                
                for(int i = 0; i < cont; i ++){
                aux[i] = chars.get(i);
                for(int u = 0; u < Caminhos.length; u++){
                if(aux[i] == Integer.parseInt(Caminhos[u].getText())){
                    Image imag = imagem.getImage().getScaledInstance(Caminhos[u].getWidth(), Caminhos[u].getHeight(), Image.SCALE_DEFAULT);
                        Caminhos[u].setIcon(new ImageIcon(imag));
                }
                }       
                }
                aux[cont] = a;
                for(int i = 0; i < aux.length; i++){
                    
                    // Corredor Ceu até Berton
                if((aux[i] == 62 && aux[i+1] == 61) || (aux[i] == 61 && aux[i+1] == 62)){
                 distance = distance + 700;   
                }
                if((aux[i] == 61 && aux[i+1] == 60) || (aux[i] == 60 && aux[i+1] == 61)){
                 distance = distance + 720;   
                }
                if((aux[i] == 60 && aux[i+1] == 59) || (aux[i] == 59 && aux[i+1] == 60)){
                 distance = distance + 720;   
                }
                if((aux[i] == 59 && aux[i+1] == 92) || (aux[i] == 92 && aux[i+1] == 59)){
                 distance = distance + 720;   
                }
                if((aux[i] == 92 && aux[i+1] == 91) || (aux[i] == 91 && aux[i+1] == 92)){
                 distance = distance + 200;   
                }
                if((aux[i] == 91 && aux[i+1] == 90) || (aux[i] == 90 && aux[i+1] == 91)){
                 distance = distance + 870;   
                }
                if((aux[i] == 90 && aux[i+1] == 58) || (aux[i] == 58 && aux[i+1] == 90)){
                 distance = distance + 10;   
                }
                if((aux[i] == 90 && aux[i+1] == 113) || (aux[i] == 113 && aux[i+1] == 90)){
                 distance = distance + 885;   
                }
                if((aux[i] == 58 && aux[i+1] == 57) || (aux[i] == 57 && aux[i+1] == 58)){
                 distance = distance + 130;   
                }
                if((aux[i] == 57 && aux[i+1] == 56) || (aux[i] == 56 && aux[i+1] == 57)){
                 distance = distance + 920;   
                }
                if((aux[i] == 56 && aux[i+1] == 55) || (aux[i] == 55 && aux[i+1] == 56)){
                 distance = distance + 930;   
                }
                if((aux[i] == 55 && aux[i+1] == 54) || (aux[i] == 54 && aux[i+1] == 55)){
                 distance = distance + 930;   
                }
                if((aux[i] == 54 && aux[i+1] == 53) || (aux[i] == 53 && aux[i+1] == 54)){
                 distance = distance + 920;   
                }
                if((aux[i] == 53 && aux[i+1] == 52) || (aux[i] == 52 && aux[i+1] == 53)){
                 distance = distance + 920;   
                }
                if((aux[i] == 52 && aux[i+1] == 88) || (aux[i] == 88 && aux[i+1] == 52)){
                 distance = distance + 350;   
                }
                if((aux[i] == 88 && aux[i+1] == 51) || (aux[i] == 51 && aux[i+1] == 88)){
                 distance = distance + 565;   
                }
                if((aux[i] == 88 && aux[i+1] == 89) || (aux[i] == 89 && aux[i+1] == 88)){
                 distance = distance + 1500;   
                }
                if((aux[i] == 51 && aux[i+1] == 50) || (aux[i] == 50 && aux[i+1] == 51)){
                 distance = distance + 915;   
                }
                if((aux[i] == 50 && aux[i+1] == 49) || (aux[i] == 49 && aux[i+1] == 50)){
                 distance = distance + 780;   
                }
                if((aux[i] == 49 && aux[i+1] == 48) || (aux[i] == 48 && aux[i+1] == 49)){
                 distance = distance + 150;   
                }
                
                //Corredor da pós
                
                if((aux[i] == 81 && aux[i+1] == 47) || (aux[i] == 47 && aux[i+1] == 81)){
                 distance = distance + 680;   
                }
                if((aux[i] == 47 && aux[i+1] == 46) || (aux[i] == 46 && aux[i+1] == 47)){
                 distance = distance + 458;   
                }
                if((aux[i] == 46 && aux[i+1] == 89) || (aux[i] == 89 && aux[i+1] == 46)){
                 distance = distance + 608;   
                }
                if((aux[i] == 89 && aux[i+1] == 93) || (aux[i] == 93 && aux[i+1] == 89)){
                 distance = distance + 1383;   
                }
                if((aux[i] == 89 && aux[i+1] == 45) || (aux[i] == 45 && aux[i+1] == 89)){
                 distance = distance + 820;   
                }
                if((aux[i] == 45 && aux[i+1] == 44) || (aux[i] == 44 && aux[i+1] == 45)){
                 distance = distance + 830;   
                }
                if((aux[i] == 44 && aux[i+1] == 78) || (aux[i] == 78 && aux[i+1] == 44)){
                 distance = distance + 1400;   
                }
                if((aux[i] == 78 && aux[i+1] == 43) || (aux[i] == 43 && aux[i+1] == 78)){
                 distance = distance + 100;   
                }
                if((aux[i] == 43 && aux[i+1] == 77) || (aux[i] == 77 && aux[i+1] == 43)){
                 distance = distance + 510;   
                }
                if((aux[i] == 43 && aux[i+1] == 31) || (aux[i] == 31 && aux[i+1] == 43)){
                 distance = distance + 1026;   
                }
                
                //Corredor escuro
                
                if((aux[i] == 41 && aux[i+1] == 42) || (aux[i] == 42 && aux[i+1] == 41)){
                 distance = distance + 160;   
                }
                if((aux[i] == 42 && aux[i+1] == 40) || (aux[i] == 40 && aux[i+1] == 42)){
                 distance = distance + 800;   
                }
                if((aux[i] == 40 && aux[i+1] == 39) || (aux[i] == 39 && aux[i+1] == 40)){
                 distance = distance + 170;   
                }
                if((aux[i] == 39 && aux[i+1] == 38) || (aux[i] == 38 && aux[i+1] == 39)){
                 distance = distance + 790;   
                }
                if((aux[i] == 38 && aux[i+1] == 93) || (aux[i] == 93 && aux[i+1] == 38)){
                 distance = distance + 180;   
                }
                if((aux[i] == 93 && aux[i+1] == 36) || (aux[i] == 36 && aux[i+1] == 93)){
                 distance = distance + 1010;   
                }
                if((aux[i] == 93 && aux[i+1] == 103) || (aux[i] == 103 && aux[i+1] == 93)){
                 distance = distance + 1180;   
                }
                if((aux[i] == 36 && aux[i+1] == 34) || (aux[i] == 34 && aux[i+1] == 36)){
                 distance = distance + 970;   
                }
                if((aux[i] == 34 && aux[i+1] == 32) || (aux[i] == 32 && aux[i+1] == 34)){
                 distance = distance + 170;   
                }
                if((aux[i] == 32 && aux[i+1] == 30) || (aux[i] == 30 && aux[i+1] == 32)){
                 distance = distance + 1020;   
                }
                if((aux[i] == 37 && aux[i+1] == 35) || (aux[i] == 35 && aux[i+1] == 37)){
                 distance = distance + 970;   
                }
                if((aux[i] == 35 && aux[i+1] == 33) || (aux[i] == 33 && aux[i+1] == 35)){
                 distance = distance + 170;   
                }
                if((aux[i] == 33 && aux[i+1] == 30) || (aux[i] == 30 && aux[i+1] == 33)){
                 distance = distance + 1020;   
                }
                
                //Corredor Grupo de Jogos
                
                if((aux[i] == 31 && aux[i+1] == 30) || (aux[i] == 30 && aux[i+1] == 31)){
                 distance = distance + 580;   
                }
                if((aux[i] == 30 && aux[i+1] == 29) || (aux[i] == 29 && aux[i+1] == 30)){
                 distance = distance + 550;   
                }
                if((aux[i] == 29 && aux[i+1] == 28) || (aux[i] == 28 && aux[i+1] == 29)){
                 distance = distance + 695;   
                }
                if((aux[i] == 28 && aux[i+1] == 27) || (aux[i] == 27 && aux[i+1] == 28)){
                 distance = distance + 720;   
                }
                if((aux[i] == 28 && aux[i+1] == 83) || (aux[i] == 83 && aux[i+1] == 28)){
                 distance = distance + 506;   
                }
                if((aux[i] == 27 && aux[i+1] == 26) || (aux[i] == 26 && aux[i+1] == 27)){
                 distance = distance + 1420;   
                }
                if((aux[i] == 26 && aux[i+1] == 25) || (aux[i] == 25 && aux[i+1] == 26)){
                 distance = distance + 140;   
                }
                if((aux[i] == 25 && aux[i+1] == 94) || (aux[i] == 94 && aux[i+1] == 25)){
                 distance = distance + 1480;   
                }
                if((aux[i] == 94 && aux[i+1] == 10) || (aux[i] == 10 && aux[i+1] == 94)){
                 distance = distance + 1540;   
                }
                if((aux[i] == 94 && aux[i+1] == 99) || (aux[i] == 99 && aux[i+1] == 94)){
                 distance = distance + 1700;   
                }
                
                // Bloco da nossa sala 
                
                if((aux[i] == 94 && aux[i+1] == 11) || (aux[i] == 11 && aux[i+1] == 94)){
                 distance = distance + 650;   
                }
                if((aux[i] == 94 && aux[i+1] == 12) || (aux[i] == 12 && aux[i+1] == 94)){
                 distance = distance + 650;   
                }
                if((aux[i] == 11 && aux[i+1] == 13) || (aux[i] == 13 && aux[i+1] == 11)){
                 distance = distance + 1240;   
                }
                if((aux[i] == 12 && aux[i+1] == 13) || (aux[i] == 13 && aux[i+1] == 12)){
                 distance = distance + 1240;   
                }
                if((aux[i] == 13 && aux[i+1] == 95) || (aux[i] == 95 && aux[i+1] == 13)){
                 distance = distance + 277;   
                }
                if((aux[i] == 14 && aux[i+1] == 95) || (aux[i] == 95 && aux[i+1] == 14)){
                 distance = distance + 730;   
                }
                if((aux[i] == 95 && aux[i+1] == 15) || (aux[i] == 15 && aux[i+1] == 95)){
                 distance = distance + 270;   
                }
                if((aux[i] == 15 && aux[i+1] == 16) || (aux[i] == 16 && aux[i+1] == 15)){
                 distance = distance + 780;   
                }
                if((aux[i] == 16 && aux[i+1] == 82) || (aux[i] == 82 && aux[i+1] == 16)){
                 distance = distance + 383;   
                }
                if((aux[i] == 82 && aux[i+1] == 17) || (aux[i] == 17 && aux[i+1] == 82)){
                 distance = distance + 229;   
                }
                if((aux[i] == 82 && aux[i+1] == 124) || (aux[i] == 124 && aux[i+1] == 82)){
                 distance = distance + 1150;   
                }
                if((aux[i] == 17 && aux[i+1] == 18) || (aux[i] == 18 && aux[i+1] == 17)){
                 distance = distance + 830;   
                }
                
                // Corredor sala de matemática
                
                  
              
                if((aux[i] == 10 && aux[i+1] == 8) || (aux[i] == 8 && aux[i+1] == 10)){
                 distance = distance + 790;   
                }
                if((aux[i] == 8 && aux[i+1] == 7) || (aux[i] == 7 && aux[i+1] == 8)){
                 distance = distance + 140;   
                }
                if((aux[i] == 7 && aux[i+1] == 96) || (aux[i] == 96 && aux[i+1] == 7)){
                 distance = distance + 770;   
                }
                if((aux[i] == 96 && aux[i+1] == 6) || (aux[i] == 6 && aux[i+1] == 96)){
                 distance = distance + 230;   
                }
                if((aux[i] == 96 && aux[i+1] == 97) || (aux[i] == 97 && aux[i+1] == 96)){
                 distance = distance + 728;   
                }
                
                //Corredor sala da fagi in law
                
                
                if((aux[i] == 113 && aux[i+1] == 63) || (aux[i] == 63 && aux[i+1] == 113)){
                 distance = distance + 130;   
                }
                if((aux[i] == 63 && aux[i+1] == 114) || (aux[i] == 114 && aux[i+1] == 63)){
                 distance = distance + 280;   
                }
                if((aux[i] == 114 && aux[i+1] == 64) || (aux[i] == 64 && aux[i+1] == 114)){
                 distance = distance + 400;   
                }
                if((aux[i] == 114 && aux[i+1] == 84) || (aux[i] == 84 && aux[i+1] == 114)){
                 distance = distance + 1120;   
                }
                if((aux[i] == 64 && aux[i+1] == 65) || (aux[i] == 65 && aux[i+1] == 64)){
                 distance = distance + 740;   
                }
                if((aux[i] == 65 && aux[i+1] == 66) || (aux[i] == 66 && aux[i+1] == 65)){
                 distance = distance + 725;   
                }
                if((aux[i] == 66 && aux[i+1] == 67) || (aux[i] == 67 && aux[i+1] == 66)){
                 distance = distance + 690;   
                }
                
                //Corredor da Corrida
                
                if((aux[i] == 84 && aux[i+1] == 115) || (aux[i] == 115 && aux[i+1] == 84)){
                 distance = distance + 720;   
                }
                if((aux[i] == 115 && aux[i+1] == 76) || (aux[i] == 76 && aux[i+1] == 115)){
                 distance = distance + 2940;   
                }
                if((aux[i] == 76 && aux[i+1] == 117) || (aux[i] == 117 && aux[i+1] == 76)){
                 distance = distance + 1150;   
                }
                if((aux[i] == 117 && aux[i+1] == 119) || (aux[i] == 119 && aux[i+1] == 117)){
                 distance = distance + 1000;   
                }
                
                //Corredor que o Guilherme dobrou a mangueira
                
                if((aux[i] == 119 && aux[i+1] == 120) || (aux[i] == 120 && aux[i+1] == 119)){
                 distance = distance + 1190;   
                }
                if((aux[i] == 120 && aux[i+1] == 69) || (aux[i] == 69 && aux[i+1] == 120)){
                 distance = distance + 210;   
                }
                if((aux[i] == 120 && aux[i+1] == 20) || (aux[i] == 20 && aux[i+1] == 120)){
                 distance = distance + 291;   
                }
                if((aux[i] == 120 && aux[i+1] == 121) || (aux[i] == 121 && aux[i+1] == 120)){
                 distance = distance + 1020;   
                }
                if((aux[i] == 69 && aux[i+1] == 70) || (aux[i] == 70 && aux[i+1] == 69)){
                 distance = distance + 10;   
                }
                if((aux[i] == 69 && aux[i+1] == 68) || (aux[i] == 68 && aux[i+1] == 69)){
                 distance = distance + 100;   
                }
                if((aux[i] == 121 && aux[i+1] == 118) || (aux[i] == 118 && aux[i+1] == 121)){
                 distance = distance + 1000;   
                }
                
                
                //Beco e corredor museu/fundos dce
                
                if((aux[i] == 118 && aux[i+1] == 75) || (aux[i] == 75 && aux[i+1] == 118)){
                 distance = distance + 610;   
                }
                if((aux[i] == 118 && aux[i+1] == 117) || (aux[i] == 117 && aux[i+1] == 118)){
                 distance = distance + 2290;   
                }
                if((aux[i] == 75 && aux[i+1] == 74) || (aux[i] == 74 && aux[i+1] == 75)){
                 distance = distance + 1850;   
                }
                if((aux[i] == 121 && aux[i+1] == 123) || (aux[i] == 123 && aux[i+1] == 121)){
                 distance = distance + 1800;   
                }
                if((aux[i] == 123 && aux[i+1] == 124) || (aux[i] == 124 && aux[i+1] == 123)){
                 distance = distance + 370;   
                }
                
                //Bloco Sala da Conversa
                
                if((aux[i] == 20 && aux[i+1] == 122) || (aux[i] == 122 && aux[i+1] == 20)){
                 distance = distance + 720;   
                }
                if((aux[i] == 122 && aux[i+1] == 21) || (aux[i] == 21 && aux[i+1] == 122)){
                 distance = distance + 255;   
                }
                if((aux[i] == 21 && aux[i+1] == 22) || (aux[i] == 22 && aux[i+1] == 21)){
                 distance = distance + 767;   
                }
                if((aux[i] == 22 && aux[i+1] == 85) || (aux[i] == 85 && aux[i+1] == 22)){
                 distance = distance + 381;   
                }
                if((aux[i] == 85 && aux[i+1] == 23) || (aux[i] == 23 && aux[i+1] == 85)){
                 distance = distance + 300;   
                }
                if((aux[i] == 23 && aux[i+1] == 24) || (aux[i] == 24 && aux[i+1] == 23)){
                 distance = distance + 840;   
                }
                if((aux[i] == 122 && aux[i+1] == 19) || (aux[i] == 19 && aux[i+1] == 122)){
                 distance = distance + 950;   
                }
                if((aux[i] == 19 && aux[i+1] == 123) || (aux[i] == 123 && aux[i+1] == 19)){
                 distance = distance + 1000;   
                }
               
                if((aux[i] == 123 && aux[i+1] == 98) || (aux[i] == 98 && aux[i+1] == 123)){
                 distance = distance + 3000;   
                }
                
                // Corredor DCE
                
                if((aux[i] == 115 && aux[i+1] == 5) || (aux[i] == 5 && aux[i+1] == 115)){
                 distance = distance + 635;   
                }
                if((aux[i] == 5 && aux[i+1] == 116) || (aux[i] == 116 && aux[i+1] == 5)){
                 distance = distance + 300;   
                }
                if((aux[i] == 116 && aux[i+1] == 77) || (aux[i] == 77 && aux[i+1] == 116)){
                 distance = distance + 1540;   
                }
                
                // Corredor Gralha
                
                if((aux[i] == 124 && aux[i+1] == 125) || (aux[i] == 125 && aux[i+1] == 124)){
                 distance = distance + 1890;   
                }
                if((aux[i] == 125 && aux[i+1] == 86) || (aux[i] == 86 && aux[i+1] == 125)){
                 distance = distance + 1404;   
                }
                if((aux[i] == 86 && aux[i+1] == 126) || (aux[i] == 126 && aux[i+1] == 86)){
                 distance = distance + 1404;   
                }
                if((aux[i] == 126 && aux[i+1] == 112) || (aux[i] == 112 && aux[i+1] == 126)){
                 distance = distance + 2480;   
                }
                if((aux[i] == 112 && aux[i+1] == 127) || (aux[i] == 127 && aux[i+1] == 112)){
                 distance = distance + 2480;   
                }
                if((aux[i] == 127 && aux[i+1] == 80) || (aux[i] == 80 && aux[i+1] == 127)){
                 distance = distance + 1760;   
                }
                if((aux[i] == 126 && aux[i+1] == 97) || (aux[i] == 97 && aux[i+1] == 126)){
                 distance = distance + 1020;   
                }
                
                // Corredor Direção
                
                if((aux[i] == 127 && aux[i+1] == 111) || (aux[i] == 111 && aux[i+1] == 127)){
                 distance = distance + 2700;   
                }
                if((aux[i] == 111 && aux[i+1] == 4) || (aux[i] == 4 && aux[i+1] == 111)){
                 distance = distance + 500;   
                }
                if((aux[i] == 4 && aux[i+1] == 110) || (aux[i] == 110 && aux[i+1] == 4)){
                 distance = distance + 300;   
                }
                if((aux[i] == 110 && aux[i+1] == 109) || (aux[i] == 109 && aux[i+1] == 110)){
                 distance = distance + 1000;   
                }
                if((aux[i] == 109 && aux[i+1] == 108) || (aux[i] == 108 && aux[i+1] == 109)){
                 distance = distance + 1825;   
                }
                if((aux[i] == 108 && aux[i+1] == 99) || (aux[i] == 99 && aux[i+1] == 108)){
                 distance = distance + 1825;   
                }
                if((aux[i] == 99 && aux[i+1] == 100) || (aux[i] == 100 && aux[i+1] == 99)){
                 distance = distance + 1020;   
                }
                if((aux[i] == 99 && aux[i+1] == 98) || (aux[i] == 98 && aux[i+1] == 99)){
                 distance = distance + 1187;   
                }
                
                if((aux[i] == 98 && aux[i+1] == 96) || (aux[i] == 96 && aux[i+1] == 98)){
                 distance = distance + 730;   
                }
                
                if((aux[i] == 109 && aux[i+1] == 104) || (aux[i] == 104 && aux[i+1] == 109)){
                 distance = distance + 3750;   
                }
                if((aux[i] == 104 && aux[i+1] == 72) || (aux[i] == 72 && aux[i+1] == 104)){
                 distance = distance + 1205;   
                }
                if((aux[i] == 72 && aux[i+1] == 105) || (aux[i] == 105 && aux[i+1] == 72)){
                 distance = distance + 1080;   
                }
                if((aux[i] == 105 && aux[i+1] == 1) || (aux[i] == 1 && aux[i+1] == 105)){
                 distance = distance + 320;   
                }
                
                // Corredor R.U.
                
                if((aux[i] == 1 && aux[i+1] == 71) || (aux[i] == 71 && aux[i+1] == 1)){
                 distance = distance + 1960;   
                }
                if((aux[i] == 1 && aux[i+1] == 105) || (aux[i] == 105 && aux[i+1] == 1)){
                 distance = distance + 320;   
                }
                if((aux[i] == 79 && aux[i+1] == 106) || (aux[i] == 106 && aux[i+1] == 79)){
                 distance = distance + 1100;   
                }
                if((aux[i] == 106 && aux[i+1] == 107) || (aux[i] == 107 && aux[i+1] == 106)){
                 distance = distance + 850;   
                }
                if((aux[i] == 107 && aux[i+1] == 81) || (aux[i] == 81 && aux[i+1] == 107)){
                 distance = distance + 230;   
                }
                if((aux[i] == 105 && aux[i+1] == 79) || (aux[i] == 79 && aux[i+1] == 105)){
                 distance = distance + 430; 
                }
                if((aux[i] == 105 && aux[i+1] == 72) || (aux[i] == 72 && aux[i+1] == 105)){
                 distance = distance + 1080;
                }
                
                //Mini Corredor Berton
                
                if((aux[i] == 48 && aux[i+1] == 106) || (aux[i] == 106 && aux[i+1] == 48)){
                 distance = distance + 1650;   
                }
                
                //Corredor CEETUR
                
                if((aux[i] == 104 && aux[i+1] == 73) || (aux[i] == 73 && aux[i+1] == 104)){
                 distance = distance + 800;   
                }
                if((aux[i] == 73 && aux[i+1] == 103) || (aux[i] == 103 && aux[i+1] == 73)){
                 distance = distance + 2660;   
                }
                if((aux[i] == 103 && aux[i+1] == 102) || (aux[i] == 102 && aux[i+1] == 103)){
                 distance = distance + 590;   
                }
                if((aux[i] == 102 && aux[i+1] == 83) || (aux[i] == 83 && aux[i+1] == 102)){
                 distance = distance + 1090;   
                }
                
                //Corredor Biblioteca
                
                if((aux[i] == 102 && aux[i+1] == 2) || (aux[i] == 2 && aux[i+1] == 102)){
                 distance = distance + 1020;   
                }
                if((aux[i] == 2 && aux[i+1] == 3) || (aux[i] == 3 && aux[i+1] == 2)){
                 distance = distance + 140;   
                }
                if((aux[i] == 3 && aux[i+1] == 101) || (aux[i] == 101 && aux[i+1] == 3)){
                 distance = distance + 1140;   
                }
                if((aux[i] == 101 && aux[i+1] == 100) || (aux[i] == 100 && aux[i+1] == 101)){
                 distance = distance + 250;   
                }
                if((aux[i] == 100 && aux[i+1] == 99) || (aux[i] == 99 && aux[i+1] == 100)){
                 distance = distance + 1020;   
                }
                
                }
     Distancia.setText((distance/100) + "m");
     distancebt = distance;
                if(a > 128 ||  b > 128){
                    JOptionPane.showMessageDialog(null,"Place not found");
                }
  }
  
  public void Reset(int busca){
        if(busca != 0){
        new Mapa().setVisible(false);
        new Mapa().setVisible(true);
        this.dispose();
        }
        }

        public void Road(int a,int b){
        if(a != 0 && b != 0){
            Geographic_Coordinates(a,b);
            
        }          
            
        }
        
        public int Checker(int c){       
        if (a == 0){
            a = c;
            return a;
        }
        else{
            b = c;
            return b;
        }
        }
        public void Centralize() {
        Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension dw = getSize();
        setLocation((ds.width - dw.width) / 2, (ds.height - dw.height) / 2);
    }
        public void parameter(){
            if ((Entrada.getText().equals("ru") && Saida.getText().equals("cepese")) || (Entrada.getText().equals("cepese") && Saida.getText().equals("ru"))){
        a = 1;
        b = 71;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("ru") && Saida.getText().equals("almoxarifado")) || (Entrada.getText().equals("almoxarifado") && Saida.getText().equals("ru"))){
        a = 1;
        b = 72;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("ru") && Saida.getText().equals("auditório gralha")) || (Entrada.getText().equals("auditório gralha") && Saida.getText().equals("ru"))){
        a = 1;
        b = 80;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("ru") && Saida.getText().equals("ficha")) || (Entrada.getText().equals("ficha") && Saida.getText().equals("ru"))){
        a = 1;
        b = 79;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("ru") && Saida.getText().equals("direção")) || (Entrada.getText().equals("direção") && Saida.getText().equals("ru"))){
        a = 1;
        b = 4;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("ru") && Saida.getText().equals("biblioteca")) || (Entrada.getText().equals("biblioteca") && Saida.getText().equals("ru"))){
        a = 1;
        b = 2;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("ru") && Saida.getText().equals("coordenação")) || (Entrada.getText().equals("coordenação") && Saida.getText().equals("ru"))){
        a = 1;
        b = 3;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("ru") && Saida.getText().equals("auditório berton")) || (Entrada.getText().equals("auditório berton") && Saida.getText().equals("ru"))){
        a = 1;
        b = 48;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("ru") && Saida.getText().equals("xerox")) || (Entrada.getText().equals("xerox") && Saida.getText().equals("ru"))){
        a = 1;
        b = 43;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("ru") && Saida.getText().equals("pós graduação")) || (Entrada.getText().equals("pós graduação") && Saida.getText().equals("ru"))){
        a = 1;
        b = 77;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("ru") && Saida.getText().equals("gráfica")) || (Entrada.getText().equals("gráfica") && Saida.getText().equals("ru"))){
        a = 1;
        b = 76;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("ru") && Saida.getText().equals("dce")) || (Entrada.getText().equals("dce") && Saida.getText().equals("ru"))){
        a = 1;
        b = 5;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("ru") && Saida.getText().equals("dce fundos")) || (Entrada.getText().equals("dce fundos") && Saida.getText().equals("ru"))){
        a = 1;
        b = 74;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("ru") && Saida.getText().equals("museu")) || (Entrada.getText().equals("museu") && Saida.getText().equals("ru"))){
        a = 1;
        b = 75;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("ru") && Saida.getText().equals("sala de reuniões")) || (Entrada.getText().equals("sala de reuniões") && Saida.getText().equals("ru"))){
        a = 1;
        b = 11;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("ru") && Saida.getText().equals("laboratório de linguas")) || (Entrada.getText().equals("laboratório de linguas") && Saida.getText().equals("ru"))){
        a = 1;
        b = 11;
        Geographic_Coordinates(a,b);              
        }
        
        // Cepese para todos
        
        if ((Entrada.getText().equals("cepese") && Saida.getText().equals("almoxarifado")) || (Entrada.getText().equals("almoxarifado") && Saida.getText().equals("cepese"))){
        a = 71;
        b = 72;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("cepese") && Saida.getText().equals("auditório gralha")) || (Entrada.getText().equals("auditório gralha") && Saida.getText().equals("cepese"))){
        a = 71;
        b = 80;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("cepese") && Saida.getText().equals("ficha")) || (Entrada.getText().equals("ficha") && Saida.getText().equals("cepese"))){
        a = 71;
        b = 79;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("cepese") && Saida.getText().equals("direção")) || (Entrada.getText().equals("direção") && Saida.getText().equals("cepese"))){
        a = 71;
        b = 4;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("cepese") && Saida.getText().equals("biblioteca")) || (Entrada.getText().equals("biblioteca") && Saida.getText().equals("cepese"))){
        a = 71;
        b = 2;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("cepese") && Saida.getText().equals("coordenação")) || (Entrada.getText().equals("coordenação") && Saida.getText().equals("cepese"))){
        a = 71;
        b = 3;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("cepese") && Saida.getText().equals("auditório berton")) || (Entrada.getText().equals("auditório berton") && Saida.getText().equals("cepese"))){
        a = 71;
        b = 48;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("cepese") && Saida.getText().equals("xerox")) || (Entrada.getText().equals("xerox") && Saida.getText().equals("cepese"))){
        a = 71;
        b = 43;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("cepese") && Saida.getText().equals("pós graduação")) || (Entrada.getText().equals("pós graduação") && Saida.getText().equals("cepese"))){
        a = 71;
        b = 77;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("cepese") && Saida.getText().equals("gráfica")) || (Entrada.getText().equals("gráfica") && Saida.getText().equals("cepese"))){
        a = 71;
        b = 76;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("cepese") && Saida.getText().equals("dce")) || (Entrada.getText().equals("dce") && Saida.getText().equals("cepese"))){
        a = 71;
        b = 5;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("cepese") && Saida.getText().equals("dce fundos")) || (Entrada.getText().equals("dce fundos") && Saida.getText().equals("cepese"))){
        a = 71;
        b = 74;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("cepese") && Saida.getText().equals("museu")) || (Entrada.getText().equals("museu") && Saida.getText().equals("cepese"))){
        a = 71;
        b = 75;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("cepese") && Saida.getText().equals("sala de reuniões")) || (Entrada.getText().equals("sala de reuniões") && Saida.getText().equals("cepese"))){
        a = 71;
        b = 11;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("cepese") && Saida.getText().equals("laboratório de linguas")) || (Entrada.getText().equals("laboratório de linguas") && Saida.getText().equals("cepese"))){
        a = 71;
        b = 11;
        Geographic_Coordinates(a,b);              
        }
        
        // Ficha para todos
        
        if ((Entrada.getText().equals("ficha") && Saida.getText().equals("almoxarifado")) || (Entrada.getText().equals("almoxarifado") && Saida.getText().equals("ficha"))){
        a = 79;
        b = 72;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("ficha") && Saida.getText().equals("auditório gralha")) || (Entrada.getText().equals("auditório gralha") && Saida.getText().equals("ficha"))){
        a = 79;
        b = 80;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("ficha") && Saida.getText().equals("direção")) || (Entrada.getText().equals("direção") && Saida.getText().equals("ficha"))){
        a = 79;
        b = 4;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("ficha") && Saida.getText().equals("biblioteca")) || (Entrada.getText().equals("biblioteca") && Saida.getText().equals("ficha"))){
        a = 79;
        b = 2;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("ficha") && Saida.getText().equals("coordenação")) || (Entrada.getText().equals("coordenação") && Saida.getText().equals("ficha"))){
        a = 79;
        b = 3;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("ficha") && Saida.getText().equals("auditório berton")) || (Entrada.getText().equals("auditório berton") && Saida.getText().equals("ficha"))){
        a = 79;
        b = 48;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("ficha") && Saida.getText().equals("xerox")) || (Entrada.getText().equals("xerox") && Saida.getText().equals("ficha"))){
        a = 79;
        b = 43;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("ficha") && Saida.getText().equals("pós graduação")) || (Entrada.getText().equals("pós graduação") && Saida.getText().equals("ficha"))){
        a = 79;
        b = 77;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("ficha") && Saida.getText().equals("gráfica")) || (Entrada.getText().equals("gráfica") && Saida.getText().equals("ficha"))){
        a = 79;
        b = 76;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("ficha") && Saida.getText().equals("dce")) || (Entrada.getText().equals("dce") && Saida.getText().equals("ficha"))){
        a = 79;
        b = 5;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("ficha") && Saida.getText().equals("dce fundos")) || (Entrada.getText().equals("dce fundos") && Saida.getText().equals("ficha"))){
        a = 79;
        b = 74;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("ficha") && Saida.getText().equals("museu")) || (Entrada.getText().equals("museu") && Saida.getText().equals("ficha"))){
        a = 79;
        b = 75;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("ficha") && Saida.getText().equals("sala de reuniões")) || (Entrada.getText().equals("sala de reuniões") && Saida.getText().equals("ficha"))){
        a = 79;
        b = 11;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("ficha") && Saida.getText().equals("laboratório de linguas")) || (Entrada.getText().equals("laboratório de linguas") && Saida.getText().equals("ficha"))){
        a = 79;
        b = 11;
        Geographic_Coordinates(a,b);              
        }
        
        // Inicio almoxarifado
        
        if ((Entrada.getText().equals("almoxarifado") && Saida.getText().equals("auditório gralha")) || (Entrada.getText().equals("auditório gralha") && Saida.getText().equals("almoxarifado"))){
        a = 72;
        b = 80;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("almoxarifado") && Saida.getText().equals("direção")) || (Entrada.getText().equals("direção") && Saida.getText().equals("almoxarifado"))){
        a = 72;
        b = 4;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("almoxarifado") && Saida.getText().equals("biblioteca")) || (Entrada.getText().equals("biblioteca") && Saida.getText().equals("almoxarifado"))){
        a = 72;
        b = 2;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("almoxarifado") && Saida.getText().equals("coordenação")) || (Entrada.getText().equals("coordenação") && Saida.getText().equals("almoxarifado"))){
        a = 72;
        b = 3;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("almoxarifado") && Saida.getText().equals("auditório berton")) || (Entrada.getText().equals("auditório berton") && Saida.getText().equals("almoxarifado"))){
        a = 72;
        b = 48;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("almoxarifado") && Saida.getText().equals("xerox")) || (Entrada.getText().equals("xerox") && Saida.getText().equals("almoxarifado"))){
        a = 72;
        b = 43;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("almoxarifado") && Saida.getText().equals("pós graduação")) || (Entrada.getText().equals("pós graduação") && Saida.getText().equals("almoxarifado"))){
        a = 72;
        b = 77;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("almoxarifado") && Saida.getText().equals("gráfica")) || (Entrada.getText().equals("gráfica") && Saida.getText().equals("almoxarifado"))){
        a = 72;
        b = 76;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("almoxarifado") && Saida.getText().equals("dce")) || (Entrada.getText().equals("dce") && Saida.getText().equals("almoxarifado"))){
        a = 72;
        b = 5;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("almoxarifado") && Saida.getText().equals("dce fundos")) || (Entrada.getText().equals("dce fundos") && Saida.getText().equals("almoxarifado"))){
        a = 72;
        b = 74;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("almoxarifado") && Saida.getText().equals("museu")) || (Entrada.getText().equals("museu") && Saida.getText().equals("almoxarifado"))){
        a = 72;
        b = 75;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("almoxarifado") && Saida.getText().equals("sala de reuniões")) || (Entrada.getText().equals("sala de reuniões") && Saida.getText().equals("almoxarifado"))){
        a = 72;
        b = 11;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("almoxarifado") && Saida.getText().equals("laboratório de linguas")) || (Entrada.getText().equals("laboratório de linguas") && Saida.getText().equals("almoxarifado"))){
        a = 72;
        b = 11;
        Geographic_Coordinates(a,b);              
        }
        
        // Inicio Auditório Gralha
        
        if ((Entrada.getText().equals("auditório gralha") && Saida.getText().equals("direção")) || (Entrada.getText().equals("direção") && Saida.getText().equals("auditório gralha"))){
        a = 80;
        b = 4;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("auditório gralha") && Saida.getText().equals("biblioteca")) || (Entrada.getText().equals("biblioteca") && Saida.getText().equals("auditório gralha"))){
        a = 80;
        b = 2;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("auditório gralha") && Saida.getText().equals("coordenação")) || (Entrada.getText().equals("coordenação") && Saida.getText().equals("auditório gralha"))){
        a = 80;
        b = 3;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("almoxarifado") && Saida.getText().equals("auditório berton")) || (Entrada.getText().equals("auditório berton") && Saida.getText().equals("auditório gralha"))){
        a = 80;
        b = 48;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("auditório gralha") && Saida.getText().equals("xerox")) || (Entrada.getText().equals("xerox") && Saida.getText().equals("auditório gralha"))){
        a = 80;
        b = 43;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("auditório gralha") && Saida.getText().equals("pós graduação")) || (Entrada.getText().equals("pós graduação") && Saida.getText().equals("auditório gralha"))){
        a = 80;
        b = 77;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("auditório gralha") && Saida.getText().equals("gráfica")) || (Entrada.getText().equals("gráfica") && Saida.getText().equals("auditório gralha"))){
        a = 80;
        b = 76;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("auditório gralha") && Saida.getText().equals("dce")) || (Entrada.getText().equals("dce") && Saida.getText().equals("auditório gralha"))){
        a = 80;
        b = 5;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("auditório gralha") && Saida.getText().equals("dce fundos")) || (Entrada.getText().equals("dce fundos") && Saida.getText().equals("auditório gralha"))){
        a = 80;
        b = 74;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("auditório gralha") && Saida.getText().equals("museu")) || (Entrada.getText().equals("museu") && Saida.getText().equals("auditório gralha"))){
        a = 80;
        b = 75;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("auditório gralha") && Saida.getText().equals("sala de reuniões")) || (Entrada.getText().equals("sala de reuniões") && Saida.getText().equals("auditório gralha"))){
        a = 80;
        b = 11;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("auditório gralha") && Saida.getText().equals("laboratório de linguas")) || (Entrada.getText().equals("laboratório de linguas") && Saida.getText().equals("auditório gralha"))){
        a = 80;
        b = 11;
        Geographic_Coordinates(a,b);              
        }
        
        // Inicio direção

        if ((Entrada.getText().equals("direção") && Saida.getText().equals("biblioteca")) || (Entrada.getText().equals("biblioteca") && Saida.getText().equals("direção"))){
        a = 4;
        b = 2;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("direção") && Saida.getText().equals("coordenação")) || (Entrada.getText().equals("coordenação") && Saida.getText().equals("direção"))){
        a = 4;
        b = 3;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("direção") && Saida.getText().equals("auditório berton")) || (Entrada.getText().equals("auditório berton") && Saida.getText().equals("direção"))){
        a = 4;
        b = 48;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("direção") && Saida.getText().equals("xerox")) || (Entrada.getText().equals("xerox") && Saida.getText().equals("direção"))){
        a = 4;
        b = 43;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("direção") && Saida.getText().equals("pós graduação")) || (Entrada.getText().equals("pós graduação") && Saida.getText().equals("direção"))){
        a = 4;
        b = 77;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("direção") && Saida.getText().equals("gráfica")) || (Entrada.getText().equals("gráfica") && Saida.getText().equals("direção"))){
        a = 4;
        b = 76;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("direção") && Saida.getText().equals("dce")) || (Entrada.getText().equals("dce") && Saida.getText().equals("direção"))){
        a = 4;
        b = 5;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("direção") && Saida.getText().equals("dce fundos")) || (Entrada.getText().equals("dce fundos") && Saida.getText().equals("direção"))){
        a = 4;
        b = 74;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("direção") && Saida.getText().equals("museu")) || (Entrada.getText().equals("museu") && Saida.getText().equals("direção"))){
        a = 4;
        b = 75;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("direção") && Saida.getText().equals("sala de reuniões")) || (Entrada.getText().equals("sala de reuniões") && Saida.getText().equals("direção"))){
        a = 4;
        b = 11;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("direção") && Saida.getText().equals("laboratório de linguas")) || (Entrada.getText().equals("laboratório de linguas") && Saida.getText().equals("direção"))){
        a = 4;
        b = 11;
        Geographic_Coordinates(a,b);              
        }
        
        // Inicio Bibilioteca
        
        if ((Entrada.getText().equals("biblioteca") && Saida.getText().equals("coordenação")) || (Entrada.getText().equals("coordenação") && Saida.getText().equals("biblioteca"))){
        a = 2;
        b = 3;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("biblioteca") && Saida.getText().equals("auditório berton")) || (Entrada.getText().equals("auditório berton") && Saida.getText().equals("biblioteca"))){
        a = 2;
        b = 48;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("biblioteca") && Saida.getText().equals("xerox")) || (Entrada.getText().equals("xerox") && Saida.getText().equals("biblioteca"))){
        a = 2;
        b = 43;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("biblioteca") && Saida.getText().equals("pós graduação")) || (Entrada.getText().equals("pós graduação") && Saida.getText().equals("biblioteca"))){
        a = 2;
        b = 77;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("biblioteca") && Saida.getText().equals("gráfica")) || (Entrada.getText().equals("gráfica") && Saida.getText().equals("biblioteca"))){
        a = 2;
        b = 76;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("biblioteca") && Saida.getText().equals("dce")) || (Entrada.getText().equals("dce") && Saida.getText().equals("biblioteca"))){
        a = 2;
        b = 5;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("biblioteca") && Saida.getText().equals("dce fundos")) || (Entrada.getText().equals("dce fundos") && Saida.getText().equals("biblioteca"))){
        a = 2;
        b = 74;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("biblioteca") && Saida.getText().equals("museu")) || (Entrada.getText().equals("museu") && Saida.getText().equals("biblioteca"))){
        a = 2;
        b = 75;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("biblioteca") && Saida.getText().equals("sala de reuniões")) || (Entrada.getText().equals("sala de reuniões") && Saida.getText().equals("biblioteca"))){
        a = 2;
        b = 11;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("biblioteca") && Saida.getText().equals("laboratório de linguas")) || (Entrada.getText().equals("laboratório de linguas") && Saida.getText().equals("biblioteca"))){
        a = 2;
        b = 11;
        Geographic_Coordinates(a,b);              
        }
        
        // Inicio Coordenação
        
        if ((Entrada.getText().equals("coordenação") && Saida.getText().equals("auditório berton")) || (Entrada.getText().equals("auditório berton") && Saida.getText().equals("coordenação"))){
        a = 3;
        b = 48;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("coordenação") && Saida.getText().equals("xerox")) || (Entrada.getText().equals("xerox") && Saida.getText().equals("coordenação"))){
        a = 3;
        b = 43;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("coordenação") && Saida.getText().equals("pós graduação")) || (Entrada.getText().equals("pós graduação") && Saida.getText().equals("coordenação"))){
        a = 3;
        b = 77;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("coordenação") && Saida.getText().equals("gráfica")) || (Entrada.getText().equals("gráfica") && Saida.getText().equals("coordenação"))){
        a = 3;
        b = 76;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("coordenação") && Saida.getText().equals("dce")) || (Entrada.getText().equals("dce") && Saida.getText().equals("coordenação"))){
        a = 3;
        b = 5;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("coordenação") && Saida.getText().equals("dce fundos")) || (Entrada.getText().equals("dce fundos") && Saida.getText().equals("coordenação"))){
        a = 3;
        b = 74;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("coordenação") && Saida.getText().equals("museu")) || (Entrada.getText().equals("museu") && Saida.getText().equals("coordenação"))){
        a = 3;
        b = 75;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("coordenação") && Saida.getText().equals("sala de reuniões")) || (Entrada.getText().equals("sala de reuniões") && Saida.getText().equals("coordenação"))){
        a = 3;
        b = 11;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("coordenação") && Saida.getText().equals("laboratório de linguas")) || (Entrada.getText().equals("laboratório de linguas") && Saida.getText().equals("coordenação"))){
        a = 3;
        b = 11;
        Geographic_Coordinates(a,b);              
        }
        
        // Inicio Auditorio berton

        
        if ((Entrada.getText().equals("auditório berton") && Saida.getText().equals("xerox")) || (Entrada.getText().equals("xerox") && Saida.getText().equals("auditório berton"))){
        a = 48;
        b = 43;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("auditório berton") && Saida.getText().equals("pós graduação")) || (Entrada.getText().equals("pós graduação") && Saida.getText().equals("auditório berton"))){
        a = 48;
        b = 77;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("auditório berton") && Saida.getText().equals("gráfica")) || (Entrada.getText().equals("gráfica") && Saida.getText().equals("auditório berton"))){
        a = 48;
        b = 76;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("auditório berton") && Saida.getText().equals("dce")) || (Entrada.getText().equals("dce") && Saida.getText().equals("auditório berton"))){
        a = 48;
        b = 5;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("auditório berton") && Saida.getText().equals("dce fundos")) || (Entrada.getText().equals("dce fundos") && Saida.getText().equals("auditório berton"))){
        a = 48;
        b = 74;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("auditório berton") && Saida.getText().equals("museu")) || (Entrada.getText().equals("museu") && Saida.getText().equals("auditório berton"))){
        a = 48;
        b = 75;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("auditório berton") && Saida.getText().equals("sala de reuniões")) || (Entrada.getText().equals("sala de reuniões") && Saida.getText().equals("auditório berton"))){
        a = 48;
        b = 11;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("auditório berton") && Saida.getText().equals("laboratório de linguas")) || (Entrada.getText().equals("laboratório de linguas") && Saida.getText().equals("auditório berton"))){
        a = 48;
        b = 11;
        Geographic_Coordinates(a,b);              
        }
        
        // Inicio XEROX
        
        if ((Entrada.getText().equals("xerox") && Saida.getText().equals("pós graduação")) || (Entrada.getText().equals("pós graduação") && Saida.getText().equals("xerox"))){
        a = 43;
        b = 77;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("xerox") && Saida.getText().equals("gráfica")) || (Entrada.getText().equals("gráfica") && Saida.getText().equals("xerox"))){
        a = 43;
        b = 76;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("xerox") && Saida.getText().equals("dce")) || (Entrada.getText().equals("dce") && Saida.getText().equals("xerox"))){
        a = 43;
        b = 5;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("xerox") && Saida.getText().equals("dce fundos")) || (Entrada.getText().equals("dce fundos") && Saida.getText().equals("xerox"))){
        a = 43;
        b = 74;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("xerox") && Saida.getText().equals("museu")) || (Entrada.getText().equals("museu") && Saida.getText().equals("xerox"))){
        a = 43;
        b = 75;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("xerox") && Saida.getText().equals("sala de reuniões")) || (Entrada.getText().equals("sala de reuniões") && Saida.getText().equals("xerox"))){
        a = 43;
        b = 11;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("xerox") && Saida.getText().equals("laboratório de linguas")) || (Entrada.getText().equals("laboratório de linguas") && Saida.getText().equals("xerox"))){
        a = 43;
        b = 11;
        Geographic_Coordinates(a,b);              
        }
        
        // Inicio pós graduação 
        
        if ((Entrada.getText().equals("pós graduação") && Saida.getText().equals("gráfica")) || (Entrada.getText().equals("gráfica") && Saida.getText().equals("xerox"))){
        a = 77;
        b = 76;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("pós graduação") && Saida.getText().equals("dce")) || (Entrada.getText().equals("dce") && Saida.getText().equals("pós graduação"))){
        a = 77;
        b = 5;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("pós graduação") && Saida.getText().equals("dce fundos")) || (Entrada.getText().equals("dce fundos") && Saida.getText().equals("pós graduação"))){
        a = 77;
        b = 74;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("pós graduação") && Saida.getText().equals("museu")) || (Entrada.getText().equals("museu") && Saida.getText().equals("pós graduação"))){
        a = 77;
        b = 75;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("pós graduação") && Saida.getText().equals("sala de reuniões")) || (Entrada.getText().equals("sala de reuniões") && Saida.getText().equals("pós graduação"))){
        a = 77;
        b = 11;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("pós graduação") && Saida.getText().equals("laboratório de linguas")) || (Entrada.getText().equals("laboratório de linguas") && Saida.getText().equals("pós graduação"))){
        a = 77;
        b = 11;
        Geographic_Coordinates(a,b);              
        }
        
        // Inicio gráfica
        
        
        if ((Entrada.getText().equals("gráfica") && Saida.getText().equals("dce")) || (Entrada.getText().equals("dce") && Saida.getText().equals("gráfica"))){
        a = 76;
        b = 5;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("gráfica") && Saida.getText().equals("dce fundos")) || (Entrada.getText().equals("dce fundos") && Saida.getText().equals("gráfica"))){
        a = 76;
        b = 74;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("gráfica") && Saida.getText().equals("museu")) || (Entrada.getText().equals("museu") && Saida.getText().equals("gráfica"))){
        a = 76;
        b = 75;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("gráfica") && Saida.getText().equals("sala de reuniões")) || (Entrada.getText().equals("sala de reuniões") && Saida.getText().equals("gráfica"))){
        a = 76;
        b = 11;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("gráfica") && Saida.getText().equals("laboratório de linguas")) || (Entrada.getText().equals("laboratório de linguas") && Saida.getText().equals("gráfica"))){
        a = 76;
        b = 11;
        Geographic_Coordinates(a,b);              
        }
        
        // Inicio DCE
        
        if ((Entrada.getText().equals("dce") && Saida.getText().equals("dce fundos")) || (Entrada.getText().equals("dce fundos") && Saida.getText().equals("dce"))){
        a = 5;
        b = 74;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("dce") && Saida.getText().equals("museu")) || (Entrada.getText().equals("museu") && Saida.getText().equals("dce"))){
        a = 5;
        b = 75;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("dce") && Saida.getText().equals("sala de reuniões")) || (Entrada.getText().equals("sala de reuniões") && Saida.getText().equals("dce"))){
        a = 5;
        b = 11;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("dce") && Saida.getText().equals("laboratório de linguas")) || (Entrada.getText().equals("laboratório de linguas") && Saida.getText().equals("dce"))){
        a = 5;
        b = 11;
        Geographic_Coordinates(a,b);              
        }
        
        // Inicio DCE fundos
        

        if ((Entrada.getText().equals("dce fundos") && Saida.getText().equals("museu")) || (Entrada.getText().equals("museu") && Saida.getText().equals("dce fundos"))){
        a = 74;
        b = 75;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("dce fundos") && Saida.getText().equals("sala de reuniões")) || (Entrada.getText().equals("sala de reuniões") && Saida.getText().equals("dce fundos"))){
        a = 74;
        b = 11;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("dce fundos") && Saida.getText().equals("laboratório de linguas")) || (Entrada.getText().equals("laboratório de linguas") && Saida.getText().equals("dce fundos"))){
        a = 74;
        b = 11;
        Geographic_Coordinates(a,b);              
        }
        
        // Inicio museu
        
        if ((Entrada.getText().equals("museu") && Saida.getText().equals("sala de reuniões")) || (Entrada.getText().equals("sala de reuniões") && Saida.getText().equals("museu"))){
        a = 75;
        b = 11;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("museu") && Saida.getText().equals("laboratório de linguas")) || (Entrada.getText().equals("laboratório de linguas") && Saida.getText().equals("museu"))){
        a = 75;
        b = 11;
        Geographic_Coordinates(a,b);              
        }
        
                // Inicio sala de reuniões
        
        if ((Entrada.getText().equals("sala de reuniões") && Saida.getText().equals("laboratório de linguas")) || (Entrada.getText().equals("laboratório de linguas") && Saida.getText().equals("sala de reuniões"))){
         ImageIcon imagem = new ImageIcon(Mapa.class.getResource("/Imagens/mono-red-ball.png")); 
         Image imag = imagem.getImage().getScaledInstance(helidbudian.getWidth(), helidbudian.getHeight(), Image.SCALE_DEFAULT);
         helidbudian.setIcon(new ImageIcon(imag));
         Distancia.setText("0m");
        }
        
        
        
        // Cozinha para todos
        
        if ((Entrada.getText().equals("cozinha") && Saida.getText().equals("cepese")) || (Entrada.getText().equals("cepese") && Saida.getText().equals("cozinha"))){
        a = 78;
        b = 71;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("cozinha") && Saida.getText().equals("almoxarifado")) || (Entrada.getText().equals("almoxarifado") && Saida.getText().equals("cozinha"))){
        a = 78;
        b = 72;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("cozinha") && Saida.getText().equals("auditório gralha")) || (Entrada.getText().equals("auditório gralha") && Saida.getText().equals("cozinha"))){
        a = 78;
        b = 80;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("cozinha") && Saida.getText().equals("ficha")) || (Entrada.getText().equals("ficha") && Saida.getText().equals("cozinha"))){
        a = 78;
        b = 79;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("cozinha") && Saida.getText().equals("direção")) || (Entrada.getText().equals("direção") && Saida.getText().equals("cozinha"))){
        a = 78;
        b = 4;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("cozinha") && Saida.getText().equals("biblioteca")) || (Entrada.getText().equals("biblioteca") && Saida.getText().equals("cozinha"))){
        a = 78;
        b = 2;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("cozinha") && Saida.getText().equals("coordenação")) || (Entrada.getText().equals("coordenação") && Saida.getText().equals("cozinha"))){
        a = 78;
        b = 3;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("cozinha") && Saida.getText().equals("auditório berton")) || (Entrada.getText().equals("auditório berton") && Saida.getText().equals("cozinha"))){
        a = 78;
        b = 48;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("cozinha") && Saida.getText().equals("xerox")) || (Entrada.getText().equals("xerox") && Saida.getText().equals("cozinha"))){
        a = 78;
        b = 43;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("cozinha") && Saida.getText().equals("pós graduação")) || (Entrada.getText().equals("pós graduação") && Saida.getText().equals("cozinha"))){
        a = 78;
        b = 77;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("cozinha") && Saida.getText().equals("gráfica")) || (Entrada.getText().equals("gráfica") && Saida.getText().equals("cozinha"))){
        a = 78;
        b = 76;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("cozinha") && Saida.getText().equals("dce")) || (Entrada.getText().equals("dce") && Saida.getText().equals("cozinha"))){
        a = 78;
        b = 5;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("cozinha") && Saida.getText().equals("dce fundos")) || (Entrada.getText().equals("dce fundos") && Saida.getText().equals("cozinha"))){
        a = 78;
        b = 74;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("cozinha") && Saida.getText().equals("museu")) || (Entrada.getText().equals("museu") && Saida.getText().equals("cozinha"))){
        a = 78;
        b = 75;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("cozinha") && Saida.getText().equals("sala de reuniões")) || (Entrada.getText().equals("sala de reuniões") && Saida.getText().equals("cozinha"))){
        a = 78;
        b = 11;
        Geographic_Coordinates(a,b);              
        }
        if ((Entrada.getText().equals("cozinha") && Saida.getText().equals("laboratório de linguas")) || (Entrada.getText().equals("laboratório de linguas") && Saida.getText().equals("cozinha"))){
        a = 78;
        b = 11;
        Geographic_Coordinates(a,b);              
        }
                
        if (Entrada.getText().equals("ru") && Saida.getText().equals("banheiro")){
            float ss = 9999;
            int sss = 0;
            a = 1;
            for(int i = 81; i < 86; i++){
               Geographic_Coordinates(a,i);;
               if( distancebt < ss){
                   ss = distancebt;
                   sss = i;
               }
            }
        clean();
        Geographic_Coordinates(a,sss);
        }
        if (Entrada.getText().equals("cepese") && Saida.getText().equals("banheiro")){
            float ss = 9999;
            int sss = 0;
            a = 71;
            for(int i = 81; i < 86; i++){
               Geographic_Coordinates(a,i);;
               if( distancebt < ss){
                   ss = distancebt;
                   sss = i;
               }
            }
        clean();
        Geographic_Coordinates(a,sss);
        }
        if (Entrada.getText().equals("almoxarifado") && Saida.getText().equals("banheiro")){
            float ss = 9999;
            int sss = 0;
            a = 72;
            for(int i = 81; i < 86; i++){
               Geographic_Coordinates(a,i);;
               if( distancebt < ss){
                   ss = distancebt;
                   sss = i;
               }
            }
        clean();
        Geographic_Coordinates(a,sss);
        }
        if (Entrada.getText().equals("auditório gralha") && Saida.getText().equals("banheiro")){
            float ss = 9999;
            int sss = 0;
            a = 80;
            for(int i = 81; i < 86; i++){
               Geographic_Coordinates(a,i);;
               if( distancebt < ss){
                   ss = distancebt;
                   sss = i;
               }
            }
        clean();
        Geographic_Coordinates(a,sss);
        }
        if (Entrada.getText().equals("ficha") && Saida.getText().equals("banheiro")){
            float ss = 9999;
            int sss = 0;
            a = 79;
            for(int i = 81; i < 86; i++){
               Geographic_Coordinates(a,i);;
               if( distancebt < ss){
                   ss = distancebt;
                   sss = i;
               }
            }
        clean();
        Geographic_Coordinates(a,sss);
        }
        if (Entrada.getText().equals("direção") && Saida.getText().equals("banheiro")){
            float ss = 9999;
            int sss = 0;
            a = 4;
            for(int i = 81; i < 86; i++){
               Geographic_Coordinates(a,i);;
               if( distancebt < ss){
                   ss = distancebt;
                   sss = i;
               }
            }
        clean();
        Geographic_Coordinates(a,sss);
        }
        if (Entrada.getText().equals("biblioteca") && Saida.getText().equals("banheiro")){
            float ss = 9999;
            int sss = 0;
            a = 2;
            for(int i = 81; i < 86; i++){
               Geographic_Coordinates(a,i);;
               if( distancebt < ss){
                   ss = distancebt;
                   sss = i;
               }
            }
        clean();
        Geographic_Coordinates(a,sss);
        }
        if (Entrada.getText().equals("coordenação") && Saida.getText().equals("banheiro")){
            float ss = 9999;
            int sss = 0;
            a = 3;
            for(int i = 81; i < 86; i++){
               Geographic_Coordinates(a,i);;
               if( distancebt < ss){
                   ss = distancebt;
                   sss = i;
               }
            }
        clean();
        Geographic_Coordinates(a,sss);
        }
        if (Entrada.getText().equals("auditório berton") && Saida.getText().equals("banheiro")){
            float ss = 9999;
            int sss = 0;
            a = 48;
            for(int i = 81; i < 86; i++){
               Geographic_Coordinates(a,i);;
               if( distancebt < ss){
                   ss = distancebt;
                   sss = i;
               }
            }
        clean();
        Geographic_Coordinates(a,sss);
        }
        if (Entrada.getText().equals("xerox") && Saida.getText().equals("banheiro")){
            float ss = 9999;
            int sss = 0;
            a = 43;
            for(int i = 81; i < 86; i++){
               Geographic_Coordinates(a,i);;
               if( distancebt < ss){
                   ss = distancebt;
                   sss = i;
               }
            }
        clean();
        Geographic_Coordinates(a,sss);
        }
        if (Entrada.getText().equals("pós graduação") && Saida.getText().equals("banheiro")){
            float ss = 9999;
            int sss = 0;
            a = 77;
            for(int i = 81; i < 86; i++){
               Geographic_Coordinates(a,i);;
               if( distancebt < ss){
                   ss = distancebt;
                   sss = i;
               }
            }
        clean();
        Geographic_Coordinates(a,sss);
        }
        if (Entrada.getText().equals("gráfica") && Saida.getText().equals("banheiro")){
            float ss = 9999;
            int sss = 0;
            a = 76;
            for(int i = 81; i < 86; i++){
               Geographic_Coordinates(a,i);;
               if( distancebt < ss){
                   ss = distancebt;
                   sss = i;
               }
            }
        clean();
        Geographic_Coordinates(a,sss);
        }
        if (Entrada.getText().equals("dce") && Saida.getText().equals("banheiro")){
            float ss = 9999;
            int sss = 0;
            a = 5;
            for(int i = 81; i < 86; i++){
               Geographic_Coordinates(a,i);;
               if( distancebt < ss){
                   ss = distancebt;
                   sss = i;
               }
            }
        clean();
        Geographic_Coordinates(a,sss);
        }
        if (Entrada.getText().equals("dce fundos") && Saida.getText().equals("banheiro")){
            float ss = 9999;
            int sss = 0;
            a = 74;
            for(int i = 81; i < 86; i++){
               Geographic_Coordinates(a,i);;
               if( distancebt < ss){
                   ss = distancebt;
                   sss = i;
               }
            }
        clean();
        Geographic_Coordinates(a,sss);
        }
        if (Entrada.getText().equals("museu") && Saida.getText().equals("banheiro")){
            float ss = 9999;
            int sss = 0;
            a = 75;
            for(int i = 81; i < 86; i++){
               Geographic_Coordinates(a,i);;
               if( distancebt < ss){
                   ss = distancebt;
                   sss = i;
               }
            }
        clean();
        Geographic_Coordinates(a,sss);
        }
        if (Entrada.getText().equals("sala de reuniões") && Saida.getText().equals("banheiro")){
            float ss = 9999;
            int sss = 0;
            a = 11;
            for(int i = 81; i < 86; i++){
               Geographic_Coordinates(a,i);;
               if( distancebt < ss){
                   ss = distancebt;
                   sss = i;
               }
            }
        clean();
        Geographic_Coordinates(a,sss);
        }
        if (Entrada.getText().equals("laboratório de línguas") && Saida.getText().equals("banheiro")){
            float ss = 9999;
            int sss = 0;
            a = 11;
            for(int i = 81; i < 86; i++){
               Geographic_Coordinates(a,i);;
               if( distancebt < ss){
                   ss = distancebt;
                   sss = i;
               }
            }
        clean();
        Geographic_Coordinates(a,sss);
        }
        
        // Strange
        if (Entrada.getText().equals("ru")){
        a = 1;
        int b = Integer.parseInt(Saida.getText());
       if(b == 37){
            b = 36;
            Geographic_Coordinates(a,b);
        }
        if(b == 35){
            b = 34;
            Geographic_Coordinates(a,b);
        }
        if(b == 33){
            b = 32;
            Geographic_Coordinates(a,b);
        }
        else{
            Geographic_Coordinates(a,b);   
        }             
        }
        if (Saida.getText().equals("ru")){
        b = 1;
        int a = Integer.parseInt(Entrada.getText());
        if(a == 37){
            a = 36;
            Geographic_Coordinates(a,b);
        }
        if(a == 35){
            a = 34;
            Geographic_Coordinates(a,b);
        }
        if(a == 33){
            a = 32;
            Geographic_Coordinates(a,b);
        }
        else{
        Geographic_Coordinates(a,b);
        }
        }
        
        if (Entrada.getText().equals("cepese")){
        a = 71;
        int b = Integer.parseInt(Saida.getText());
       if(b == 37){
            b = 36;
            Geographic_Coordinates(a,b);
        }
        if(b == 35){
            b = 34;
            Geographic_Coordinates(a,b);
        }
        if(b == 33){
            b = 32;
            Geographic_Coordinates(a,b);
        }
        else{
            Geographic_Coordinates(a,b);   
        }             
        }
        if (Saida.getText().equals("banheiro")){
            int a = Integer.parseInt(Entrada.getText());
            float ss = 9999;
            int sss = 0;
            for(int i = 81; i < 86; i++){
               Geographic_Coordinates(a,i);;
               if( distancebt < ss){
                   ss = distancebt;
                   sss = i;
               }
            }
        clean();
        Geographic_Coordinates(a,sss);
        }
        
        if (Saida.getText().equals("cepese")){
        b = 71;
        int a = Integer.parseInt(Entrada.getText());
        if(a == 37){
            a = 36;
            Geographic_Coordinates(a,b);
        }
        if(a == 35){
            a = 34;
            Geographic_Coordinates(a,b);
        }
        if(a == 33){
            a = 32;
            Geographic_Coordinates(a,b);
        }
        else{
        Geographic_Coordinates(a,b);
        }              
        }
        
        if (Entrada.getText().equals("ficha")){
        a = 79;
        int b = Integer.parseInt(Saida.getText());
        if(b == 37){
            b = 36;
            Geographic_Coordinates(a,b);
        }
        if(b == 35){
            b = 34;
            Geographic_Coordinates(a,b);
        }
        if(b == 33){
            b = 32;
            Geographic_Coordinates(a,b);
        }
        else{
            Geographic_Coordinates(a,b);   
        }              
        }
        if (Saida.getText().equals("ficha")){
        b = 79;
        int a = Integer.parseInt(Entrada.getText());
         if(a == 37){
            a = 36;
            Geographic_Coordinates(a,b);
        }
        if(a == 35){
            a = 34;
            Geographic_Coordinates(a,b);
        }
        if(a == 33){
            a = 32;
            Geographic_Coordinates(a,b);
        }
        else{
        Geographic_Coordinates(a,b);
        }              
        }
        
        if (Entrada.getText().equals("almoxarifado")){
        a = 72;
        int b = Integer.parseInt(Saida.getText());
       if(b == 37){
            b = 36;
            Geographic_Coordinates(a,b);
        }
        if(b == 35){
            b = 34;
            Geographic_Coordinates(a,b);
        }
        if(b == 33){
            b = 32;
            Geographic_Coordinates(a,b);
        }
        else{
            Geographic_Coordinates(a,b);   
        }              
        }
        if (Saida.getText().equals("almoxarifado")){
        b = 72;
        int a = Integer.parseInt(Entrada.getText());
        if(a == 37){
            a = 36;
            Geographic_Coordinates(a,b);
        }
        if(a == 35){
            a = 34;
            Geographic_Coordinates(a,b);
        }
        if(a == 33){
            a = 32;
            Geographic_Coordinates(a,b);
        }
        else{
        Geographic_Coordinates(a,b);
        }             
        }
        
        if (Entrada.getText().equals("direção")){
        a = 4;
        int b = Integer.parseInt(Saida.getText());
       if(b == 37){
            b = 36;
            Geographic_Coordinates(a,b);
        }
        if(b == 35){
            b = 34;
            Geographic_Coordinates(a,b);
        }
        if(b == 33){
            b = 32;
            Geographic_Coordinates(a,b);
        }
        else{
            Geographic_Coordinates(a,b);   
        }              
        }
        if (Saida.getText().equals("direção")){
        b = 4;
        int a = Integer.parseInt(Entrada.getText());
        if(a == 37){
            a = 36;
            Geographic_Coordinates(a,b);
        }
        if(a == 35){
            a = 34;
            Geographic_Coordinates(a,b);
        }
        if(a == 33){
            a = 32;
            Geographic_Coordinates(a,b);
        }
        else{
        Geographic_Coordinates(a,b);
        }              
        }
        
        if (Entrada.getText().equals("auditório berton")){
        a = 48;
        int b = Integer.parseInt(Saida.getText());
        if(b == 37){
            b = 36;
            Geographic_Coordinates(a,b);
        }
        if(b == 35){
            b = 34;
            Geographic_Coordinates(a,b);
        }
        if(b == 33){
            b = 32;
            Geographic_Coordinates(a,b);
        }
        else{
            Geographic_Coordinates(a,b);   
        }               
        }
        if (Saida.getText().equals("auditório berton")){
        b = 48;
        int a = Integer.parseInt(Entrada.getText());
        if(a == 37){
            a = 36;
            Geographic_Coordinates(a,b);
        }
        if(a == 35){
            a = 34;
            Geographic_Coordinates(a,b);
        }
        if(a == 33){
            a = 32;
            Geographic_Coordinates(a,b);
        }
        else{
        Geographic_Coordinates(a,b);
        }             
        }
        
        if (Entrada.getText().equals("auditório gralha")){
        a = 80;
        int b = Integer.parseInt(Saida.getText());
       if(b == 37){
            b = 36;
            Geographic_Coordinates(a,b);
        }
        if(b == 35){
            b = 34;
            Geographic_Coordinates(a,b);
        }
        if(b == 33){
            b = 32;
            Geographic_Coordinates(a,b);
        }
        else{
            Geographic_Coordinates(a,b);   
        }               
        }
        if (Saida.getText().equals("auditório gralha")){
        b = 80;
        int a = Integer.parseInt(Entrada.getText());
        if(a == 37){
            a = 36;
            Geographic_Coordinates(a,b);
        }
        if(a == 35){
            a = 34;
            Geographic_Coordinates(a,b);
        }
        if(a == 33){
            a = 32;
            Geographic_Coordinates(a,b);
        }
        else{
        Geographic_Coordinates(a,b);
        }             
        }
        
        if (Entrada.getText().equals("biblioteca")){
        a = 2;
        int b = Integer.parseInt(Saida.getText());
       if(b == 37){
            b = 36;
            Geographic_Coordinates(a,b);
        }
        if(b == 35){
            b = 34;
            Geographic_Coordinates(a,b);
        }
        if(b == 33){
            b = 32;
            Geographic_Coordinates(a,b);
        }
        else{
            Geographic_Coordinates(a,b);   
        }              
        }
        if (Saida.getText().equals("biblioteca")){
        b = 2;
        int a = Integer.parseInt(Entrada.getText());
        if(a == 37){
            a = 36;
            Geographic_Coordinates(a,b);
        }
        if(a == 35){
            a = 34;
            Geographic_Coordinates(a,b);
        }
        if(a == 33){
            a = 32;
            Geographic_Coordinates(a,b);
        }
        else{
        Geographic_Coordinates(a,b);
        }             
        }
        
        if (Entrada.getText().equals("coordenação")){
        a = 3;
        int b = Integer.parseInt(Saida.getText());
       if(b == 37){
            b = 36;
            Geographic_Coordinates(a,b);
        }
        if(b == 35){
            b = 34;
            Geographic_Coordinates(a,b);
        }
        if(b == 33){
            b = 32;
            Geographic_Coordinates(a,b);
        }
        else{
            Geographic_Coordinates(a,b);   
        }              
        }
        if (Saida.getText().equals("coodernação")){
        b = 3;
        int a = Integer.parseInt(Entrada.getText());
        if(a == 37){
            a = 36;
            Geographic_Coordinates(a,b);
        }
        if(a == 35){
            a = 34;
            Geographic_Coordinates(a,b);
        }
        if(a == 33){
            a = 32;
            Geographic_Coordinates(a,b);
        }
        else{
        Geographic_Coordinates(a,b);
        }             
        }
        
        if (Entrada.getText().equals("ceetur")){
        a = 73;
        int b = Integer.parseInt(Saida.getText());
       if(b == 37){
            b = 36;
            Geographic_Coordinates(a,b);
        }
        if(b == 35){
            b = 34;
            Geographic_Coordinates(a,b);
        }
        if(b == 33){
            b = 32;
            Geographic_Coordinates(a,b);
        }
        else{
            Geographic_Coordinates(a,b);   
        }              
        }
        if (Saida.getText().equals("ceetur")){
        b = 73;
        int a = Integer.parseInt(Entrada.getText());
        if(a == 37){
            a = 36;
            Geographic_Coordinates(a,b);
        }
        if(a == 35){
            a = 34;
            Geographic_Coordinates(a,b);
        }
        if(a == 33){
            a = 32;
            Geographic_Coordinates(a,b);
        }
        else{
        Geographic_Coordinates(a,b);
        }             
        }
        
        if (Entrada.getText().equals("laboratório de linguas")){
        a = 11;
        int b = Integer.parseInt(Saida.getText());
        if(b == 37){
            b = 36;
            Geographic_Coordinates(a,b);
        }
        if(b == 35){
            b = 34;
            Geographic_Coordinates(a,b);
        }
        if(b == 33){
            b = 32;
            Geographic_Coordinates(a,b);
        }
        else{
            Geographic_Coordinates(a,b);   
        }               
        }
        if (Saida.getText().equals("laboratório de linguas")){
        b = 11;
        int a = Integer.parseInt(Entrada.getText());
        if(a == 37){
            a = 36;
            Geographic_Coordinates(a,b);
        }
        if(a == 35){
            a = 34;
            Geographic_Coordinates(a,b);
        }
        if(a == 33){
            a = 32;
            Geographic_Coordinates(a,b);
        }
        else{
        Geographic_Coordinates(a,b);
        }            
        }
        
        if (Entrada.getText().equals("sala de reuniões")){
        a = 11;
        int b = Integer.parseInt(Saida.getText());
       if(b == 37){
            b = 36;
            Geographic_Coordinates(a,b);
        }
        if(b == 35){
            b = 34;
            Geographic_Coordinates(a,b);
        }
        if(b == 33){
            b = 32;
            Geographic_Coordinates(a,b);
        }
        else{
            Geographic_Coordinates(a,b);   
        }              
        }
        if (Saida.getText().equals("sala de reuniões")){
        b = 11;
        int a = Integer.parseInt(Entrada.getText());
        if(a == 37){
            a = 36;
            Geographic_Coordinates(a,b);
        }
        if(a == 35){
            a = 34;
            Geographic_Coordinates(a,b);
        }
        if(a == 33){
            a = 32;
            Geographic_Coordinates(a,b);
        }
        else{
        Geographic_Coordinates(a,b);
        }             
        }
        
        if (Entrada.getText().equals("dce")){
        a = 5;
        int b = Integer.parseInt(Saida.getText());
       if(b == 37){
            b = 36;
            Geographic_Coordinates(a,b);
        }
        if(b == 35){
            b = 34;
            Geographic_Coordinates(a,b);
        }
        if(b == 33){
            b = 32;
            Geographic_Coordinates(a,b);
        }
        else{
            Geographic_Coordinates(a,b);   
        }               
        }
        if (Saida.getText().equals("dce")){
        b = 5;
        int a = Integer.parseInt(Entrada.getText());
          if(a == 37){
            a = 36;
            Geographic_Coordinates(a,b);
        }
        if(a == 35){
            a = 34;
            Geographic_Coordinates(a,b);
        }
        if(a == 33){
            a = 32;
            Geographic_Coordinates(a,b);
        }
        else{
        Geographic_Coordinates(a,b);
        }              
        }
        
        if (Entrada.getText().equals("dce fundos")){
        a = 74;
        int b = Integer.parseInt(Saida.getText());
       if(b == 37){
            b = 36;
            Geographic_Coordinates(a,b);
        }
        if(b == 35){
            b = 34;
            Geographic_Coordinates(a,b);
        }
        if(b == 33){
            b = 32;
            Geographic_Coordinates(a,b);
        }
        else{
            Geographic_Coordinates(a,b);   
        }             
        }
        if (Saida.getText().equals("dce fundos")){
        b = 74;
        int a = Integer.parseInt(Entrada.getText());
        if(a == 37){
            a = 36;
            Geographic_Coordinates(a,b);
        }
        if(a == 35){
            a = 34;
            Geographic_Coordinates(a,b);
        }
        if(a == 33){
            a = 32;
            Geographic_Coordinates(a,b);
        }
        else{
        Geographic_Coordinates(a,b);
        }              
        }
        
        if (Entrada.getText().equals("museu")){
        a = 75;
        int b = Integer.parseInt(Saida.getText());
       if(b == 37){
            b = 36;
            Geographic_Coordinates(a,b);
        }
        if(b == 35){
            b = 34;
            Geographic_Coordinates(a,b);
        }
        if(b == 33){
            b = 32;
            Geographic_Coordinates(a,b);
        }
        else{
            Geographic_Coordinates(a,b);   
        }               
        }
        if (Saida.getText().equals("museu")){
        b = 75;
        int a = Integer.parseInt(Entrada.getText());
        if(a == 37){
            a = 36;
            Geographic_Coordinates(a,b);
        }
        if(a == 35){
            a = 34;
            Geographic_Coordinates(a,b);
        }
        if(a == 33){
            a = 32;
            Geographic_Coordinates(a,b);
        }
        else{
        Geographic_Coordinates(a,b);
        }             
        }
        
        if (Entrada.getText().equals("gráfica")){
        a = 76;
        int b = Integer.parseInt(Saida.getText());
       if(b == 37){
            b = 36;
            Geographic_Coordinates(a,b);
        }
        if(b == 35){
            b = 34;
            Geographic_Coordinates(a,b);
        }
        if(b == 33){
            b = 32;
            Geographic_Coordinates(a,b);
        }
        else{
            Geographic_Coordinates(a,b);   
        }               
        }
        if (Saida.getText().equals("gráfica")){
        b = 76;
        int a = Integer.parseInt(Entrada.getText());
        if(a == 37){
            a = 36;
            Geographic_Coordinates(a,b);
        }
        if(a == 35){
            a = 34;
            Geographic_Coordinates(a,b);
        }
        if(a == 33){
            a = 32;
            Geographic_Coordinates(a,b);
        }
        else{
        Geographic_Coordinates(a,b);
        }             
        }
        
        if (Entrada.getText().equals("cozinha")){
        a = 78;
        int b = Integer.parseInt(Saida.getText());
        if(b == 37){
            b = 36;
            Geographic_Coordinates(a,b);
        }
        if(b == 35){
            b = 34;
            Geographic_Coordinates(a,b);
        }
        if(b == 33){
            b = 32;
            Geographic_Coordinates(a,b);
        }
        else{
            Geographic_Coordinates(a,b);   
        }              
        }
        if (Saida.getText().equals("cozinha")){
        b = 78;
        int a = Integer.parseInt(Entrada.getText());
        if(a == 37){
            a = 36;
            Geographic_Coordinates(a,b);
        }
        if(a == 35){
            a = 34;
            Geographic_Coordinates(a,b);
        }
        if(a == 33){
            a = 32;
            Geographic_Coordinates(a,b);
        }
        else{
        Geographic_Coordinates(a,b);
        }             
        }
        
         if (Entrada.getText().equals("xerox")){
        a = 43;
        int b = Integer.parseInt(Saida.getText());
        if(b == 37){
            b = 36;
            Geographic_Coordinates(a,b);
        }
        if(b == 35){
            b = 34;
            Geographic_Coordinates(a,b);
        }
        if(b == 33){
            b = 32;
            Geographic_Coordinates(a,b);
        }
        else{
            Geographic_Coordinates(a,b);   
        }              
        }
        if (Saida.getText().equals("xerox")){
        b = 43;
        int a = Integer.parseInt(Entrada.getText());
        if(a == 37){
            a = 36;
            Geographic_Coordinates(a,b);
        }
        if(a == 35){
            a = 34;
            Geographic_Coordinates(a,b);
        }
        if(a == 33){
            a = 32;
            Geographic_Coordinates(a,b);
        }
        else{
        Geographic_Coordinates(a,b);
        }             
        }
        
         if (Entrada.getText().equals("pós graduação")){
        a = 77;
        int b = Integer.parseInt(Saida.getText());
        if(b == 37){
            b = 36;
            Geographic_Coordinates(a,b);
        }
        if(b == 35){
            b = 34;
            Geographic_Coordinates(a,b);
        }
        if(b == 33){
            b = 32;
            Geographic_Coordinates(a,b);
        }
        else{
            Geographic_Coordinates(a,b);   
        }              
        }
        if (Saida.getText().equals("pós graduação")){
        b = 77;
        int a = Integer.parseInt(Entrada.getText());
        if(a == 37){
            a = 36;
            Geographic_Coordinates(a,b);
        }
        if(a == 35){
            a = 34;
            Geographic_Coordinates(a,b);
        }
        if(a == 33){
            a = 32;
            Geographic_Coordinates(a,b);
        }
        else{
        Geographic_Coordinates(a,b);
        }             
        }
        if ((Integer.parseInt(Entrada.getText()) == 36 && Integer.parseInt(Saida.getText()) == 37) || ((Integer.parseInt(Entrada.getText()) == 37 && Integer.parseInt(Saida.getText()) == 36))){
         ImageIcon imagem = new ImageIcon(Mapa.class.getResource("/Imagens/mono-red-ball.png")); 
         Image imag = imagem.getImage().getScaledInstance(Sala36.getWidth(), Sala36.getHeight(), Image.SCALE_DEFAULT);
         Sala36.setIcon(new ImageIcon(imag));
         Distancia.setText("0m");
        }
         if ((Integer.parseInt(Entrada.getText()) == 34 && Integer.parseInt(Saida.getText()) == 35) || ((Integer.parseInt(Entrada.getText()) == 35 && Integer.parseInt(Saida.getText()) == 34))){
         ImageIcon imagem = new ImageIcon(Mapa.class.getResource("/Imagens/mono-red-ball.png")); 
         Image imag = imagem.getImage().getScaledInstance(Sala34.getWidth(), Sala34.getHeight(), Image.SCALE_DEFAULT);
         Sala34.setIcon(new ImageIcon(imag));
         Distancia.setText("0m");
        }
         if ((Integer.parseInt(Entrada.getText()) == 32 && Integer.parseInt(Saida.getText()) == 33) || ((Integer.parseInt(Entrada.getText()) == 33 && Integer.parseInt(Saida.getText()) == 32))){
         ImageIcon imagem = new ImageIcon(Mapa.class.getResource("/Imagens/mono-red-ball.png")); 
         Image imag = imagem.getImage().getScaledInstance(Sala32.getWidth(), Sala32.getHeight(), Image.SCALE_DEFAULT);
         Sala32.setIcon(new ImageIcon(imag));
         Distancia.setText("0m");
        }
        else{
        int a = Integer.parseInt(Entrada.getText());
        int b = Integer.parseInt(Saida.getText());
        if(a == 37){
            a = 36;
            Geographic_Coordinates(a,b);
        }
        if(b == 37){
            b = 36;
            Geographic_Coordinates(a,b);
        }
        if(a == 35){
            a = 34;
            Geographic_Coordinates(a,b);
        }
        if(b == 35){
            b = 34;
            Geographic_Coordinates(a,b);
        }
        if(a == 33){
            a = 32;
            Geographic_Coordinates(a,b);
        }
        if(b == 33){
            b = 32;
            Geographic_Coordinates(a,b);
        }
        else{
           Geographic_Coordinates(a,b); 
        }
        }
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        ru = new javax.swing.JLabel();
        caminho105 = new javax.swing.JLabel();
        Sala42 = new javax.swing.JLabel();
        Sala41 = new javax.swing.JLabel();
        Sala40 = new javax.swing.JLabel();
        Sala39 = new javax.swing.JLabel();
        Sala38 = new javax.swing.JLabel();
        Sala36 = new javax.swing.JLabel();
        Sala34 = new javax.swing.JLabel();
        Sala32 = new javax.swing.JLabel();
        caminho106 = new javax.swing.JLabel();
        Sala49 = new javax.swing.JLabel();
        Banheiro81 = new javax.swing.JLabel();
        Sala47 = new javax.swing.JLabel();
        Sala31 = new javax.swing.JLabel();
        Sala46 = new javax.swing.JLabel();
        Sala30 = new javax.swing.JLabel();
        Brinquedoteca = new javax.swing.JLabel();
        sala28 = new javax.swing.JLabel();
        sala27 = new javax.swing.JLabel();
        sala26 = new javax.swing.JLabel();
        sala25 = new javax.swing.JLabel();
        banheiro83 = new javax.swing.JLabel();
        helidbudian = new javax.swing.JLabel();
        caminho95 = new javax.swing.JLabel();
        sala14 = new javax.swing.JLabel();
        sala15 = new javax.swing.JLabel();
        sala16 = new javax.swing.JLabel();
        banheiro82 = new javax.swing.JLabel();
        sala17 = new javax.swing.JLabel();
        sala24 = new javax.swing.JLabel();
        sala10 = new javax.swing.JLabel();
        sala8 = new javax.swing.JLabel();
        sala7 = new javax.swing.JLabel();
        sala6 = new javax.swing.JLabel();
        Sala50 = new javax.swing.JLabel();
        caminho96 = new javax.swing.JLabel();
        caminho103 = new javax.swing.JLabel();
        Caminho88 = new javax.swing.JLabel();
        Sala52 = new javax.swing.JLabel();
        Sala45 = new javax.swing.JLabel();
        Xerox = new javax.swing.JLabel();
        Sala53 = new javax.swing.JLabel();
        Sala54 = new javax.swing.JLabel();
        Sala55 = new javax.swing.JLabel();
        Sala56 = new javax.swing.JLabel();
        Sala57 = new javax.swing.JLabel();
        Caminho90 = new javax.swing.JLabel();
        Sala59 = new javax.swing.JLabel();
        pós = new javax.swing.JLabel();
        Sala60 = new javax.swing.JLabel();
        Sala62 = new javax.swing.JLabel();
        Sala61 = new javax.swing.JLabel();
        caminho104 = new javax.swing.JLabel();
        cepese = new javax.swing.JLabel();
        caminho110 = new javax.swing.JLabel();
        gralha = new javax.swing.JLabel();
        sala18 = new javax.swing.JLabel();
        sala23 = new javax.swing.JLabel();
        banheiro = new javax.swing.JLabel();
        sala22 = new javax.swing.JLabel();
        sala21 = new javax.swing.JLabel();
        caminho122 = new javax.swing.JLabel();
        sala20 = new javax.swing.JLabel();
        sala68 = new javax.swing.JLabel();
        sala69 = new javax.swing.JLabel();
        sala70 = new javax.swing.JLabel();
        grafica = new javax.swing.JLabel();
        museu = new javax.swing.JLabel();
        fundosdce = new javax.swing.JLabel();
        sala64 = new javax.swing.JLabel();
        sala63 = new javax.swing.JLabel();
        caminho113 = new javax.swing.JLabel();
        caminho119 = new javax.swing.JLabel();
        caminho120 = new javax.swing.JLabel();
        caminho123 = new javax.swing.JLabel();
        sala65 = new javax.swing.JLabel();
        sala66 = new javax.swing.JLabel();
        sala67 = new javax.swing.JLabel();
        Sala44 = new javax.swing.JLabel();
        Cozinha = new javax.swing.JLabel();
        Caminho91 = new javax.swing.JLabel();
        Caminho92 = new javax.swing.JLabel();
        Sala58 = new javax.swing.JLabel();
        Caminho89 = new javax.swing.JLabel();
        Caminho93 = new javax.swing.JLabel();
        Sala51 = new javax.swing.JLabel();
        caminho107 = new javax.swing.JLabel();
        auditorioberton = new javax.swing.JLabel();
        caminho102 = new javax.swing.JLabel();
        biblioteca = new javax.swing.JLabel();
        almoxarifado = new javax.swing.JLabel();
        caminho111 = new javax.swing.JLabel();
        direcao = new javax.swing.JLabel();
        coordenacao = new javax.swing.JLabel();
        caminho98 = new javax.swing.JLabel();
        caminho97 = new javax.swing.JLabel();
        caminho94 = new javax.swing.JLabel();
        caminho99 = new javax.swing.JLabel();
        caminho100 = new javax.swing.JLabel();
        caminho101 = new javax.swing.JLabel();
        caminho108 = new javax.swing.JLabel();
        sala13 = new javax.swing.JLabel();
        banheiro84 = new javax.swing.JLabel();
        caminho115 = new javax.swing.JLabel();
        dce = new javax.swing.JLabel();
        caminho116 = new javax.swing.JLabel();
        caminho114 = new javax.swing.JLabel();
        caminho117 = new javax.swing.JLabel();
        caminho118 = new javax.swing.JLabel();
        caminho125 = new javax.swing.JLabel();
        caminho121 = new javax.swing.JLabel();
        sala19 = new javax.swing.JLabel();
        caminho124 = new javax.swing.JLabel();
        caminho127 = new javax.swing.JLabel();
        caminho112 = new javax.swing.JLabel();
        caminho126 = new javax.swing.JLabel();
        caminho86 = new javax.swing.JLabel();
        caminho109 = new javax.swing.JLabel();
        ceetur = new javax.swing.JLabel();
        ficharu = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        jButton49 = new javax.swing.JButton();
        jButton50 = new javax.swing.JButton();
        jButton51 = new javax.swing.JButton();
        jButton52 = new javax.swing.JButton();
        jButton53 = new javax.swing.JButton();
        jButton54 = new javax.swing.JButton();
        jButton55 = new javax.swing.JButton();
        jButton56 = new javax.swing.JButton();
        jButton57 = new javax.swing.JButton();
        jButton58 = new javax.swing.JButton();
        jButton59 = new javax.swing.JButton();
        jButton60 = new javax.swing.JButton();
        jButton61 = new javax.swing.JButton();
        jButton62 = new javax.swing.JButton();
        jButton63 = new javax.swing.JButton();
        jButton64 = new javax.swing.JButton();
        jButton65 = new javax.swing.JButton();
        jButton66 = new javax.swing.JButton();
        jButton67 = new javax.swing.JButton();
        jButton68 = new javax.swing.JButton();
        jButton69 = new javax.swing.JButton();
        jButton70 = new javax.swing.JButton();
        jButton71 = new javax.swing.JButton();
        jButton72 = new javax.swing.JButton();
        jButton73 = new javax.swing.JButton();
        jButton74 = new javax.swing.JButton();
        jButton75 = new javax.swing.JButton();
        jButton76 = new javax.swing.JButton();
        jButton77 = new javax.swing.JButton();
        jButton78 = new javax.swing.JButton();
        jButton79 = new javax.swing.JButton();
        jButton80 = new javax.swing.JButton();
        jButton81 = new javax.swing.JButton();
        jButton82 = new javax.swing.JButton();
        jButton83 = new javax.swing.JButton();
        Entrada = new javax.swing.JTextField();
        Saida = new javax.swing.JTextField();
        jButton84 = new javax.swing.JButton();
        jButton85 = new javax.swing.JButton();
        jButton86 = new javax.swing.JButton();
        cadeirante = new javax.swing.JCheckBox();
        jButton87 = new javax.swing.JButton();
        jButton88 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Distancia = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ru.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        ru.setText("1");
        jPanel1.add(ru, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 420, 50, 40));

        caminho105.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        caminho105.setText("105");
        jPanel1.add(caminho105, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 420, 50, 40));

        Sala42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        Sala42.setText("42");
        jPanel1.add(Sala42, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 570, 50, 40));

        Sala41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        Sala41.setText("41");
        jPanel1.add(Sala41, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 570, 50, 40));

        Sala40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        Sala40.setText("40");
        jPanel1.add(Sala40, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 570, 50, 40));

        Sala39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        Sala39.setText("39");
        jPanel1.add(Sala39, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 570, 50, 40));

        Sala38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        Sala38.setText("38");
        jPanel1.add(Sala38, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 570, 50, 40));

        Sala36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        Sala36.setText("36");
        jPanel1.add(Sala36, new org.netbeans.lib.awtextra.AbsoluteConstraints(1440, 570, 50, 40));

        Sala34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        Sala34.setText("34");
        jPanel1.add(Sala34, new org.netbeans.lib.awtextra.AbsoluteConstraints(1550, 570, 50, 40));

        Sala32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        Sala32.setText("32");
        jPanel1.add(Sala32, new org.netbeans.lib.awtextra.AbsoluteConstraints(1640, 570, 50, 40));

        caminho106.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        caminho106.setText("106");
        jPanel1.add(caminho106, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 420, 50, 40));

        Sala49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        Sala49.setText("49");
        jPanel1.add(Sala49, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 180, 50, 40));

        Banheiro81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        Banheiro81.setText("81");
        jPanel1.add(Banheiro81, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 340, 50, 40));

        Sala47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        Sala47.setText("47");
        jPanel1.add(Sala47, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 310, 50, 40));

        Sala31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        Sala31.setText("31");
        jPanel1.add(Sala31, new org.netbeans.lib.awtextra.AbsoluteConstraints(1720, 460, 50, 40));

        Sala46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        Sala46.setText("46");
        jPanel1.add(Sala46, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 310, 50, 40));

        Sala30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        Sala30.setText("30");
        jPanel1.add(Sala30, new org.netbeans.lib.awtextra.AbsoluteConstraints(1720, 580, 50, 40));

        Brinquedoteca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        Brinquedoteca.setText("29");
        jPanel1.add(Brinquedoteca, new org.netbeans.lib.awtextra.AbsoluteConstraints(1720, 700, 50, 40));

        sala28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        sala28.setText("28");
        jPanel1.add(sala28, new org.netbeans.lib.awtextra.AbsoluteConstraints(1720, 800, 50, 40));

        sala27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        sala27.setText("27");
        jPanel1.add(sala27, new org.netbeans.lib.awtextra.AbsoluteConstraints(1720, 900, 50, 40));

        sala26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        sala26.setText("26");
        jPanel1.add(sala26, new org.netbeans.lib.awtextra.AbsoluteConstraints(1720, 1010, 50, 40));

        sala25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        sala25.setText("25");
        jPanel1.add(sala25, new org.netbeans.lib.awtextra.AbsoluteConstraints(1720, 1110, 50, 40));

        banheiro83.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        banheiro83.setText("83");
        jPanel1.add(banheiro83, new org.netbeans.lib.awtextra.AbsoluteConstraints(1640, 800, 50, 40));

        helidbudian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        helidbudian.setText("11");
        jPanel1.add(helidbudian, new org.netbeans.lib.awtextra.AbsoluteConstraints(1880, 1300, 50, 40));

        caminho95.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        caminho95.setText("95");
        jPanel1.add(caminho95, new org.netbeans.lib.awtextra.AbsoluteConstraints(2180, 1300, 50, 40));

        sala14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        sala14.setText("14");
        jPanel1.add(sala14, new org.netbeans.lib.awtextra.AbsoluteConstraints(2180, 1170, 50, 40));

        sala15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        sala15.setText("15");
        jPanel1.add(sala15, new org.netbeans.lib.awtextra.AbsoluteConstraints(2180, 1370, 50, 40));

        sala16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        sala16.setText("16");
        jPanel1.add(sala16, new org.netbeans.lib.awtextra.AbsoluteConstraints(2180, 1450, 50, 40));

        banheiro82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        banheiro82.setText("82");
        jPanel1.add(banheiro82, new org.netbeans.lib.awtextra.AbsoluteConstraints(2180, 1500, 50, 40));

        sala17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        sala17.setText("17");
        jPanel1.add(sala17, new org.netbeans.lib.awtextra.AbsoluteConstraints(2180, 1550, 50, 40));

        sala24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        sala24.setText("24");
        jPanel1.add(sala24, new org.netbeans.lib.awtextra.AbsoluteConstraints(1760, 3660, 50, 40));

        sala10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        sala10.setText("10");
        jPanel1.add(sala10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1720, 1550, 50, 40));

        sala8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        sala8.setText("8");
        jPanel1.add(sala8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1600, 1550, 50, 40));

        sala7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        sala7.setText("7");
        jPanel1.add(sala7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1510, 1550, 50, 40));

        sala6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        sala6.setText("6");
        jPanel1.add(sala6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 1550, 50, 40));

        Sala50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        Sala50.setText("50");
        jPanel1.add(Sala50, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 170, 50, 40));

        caminho96.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        caminho96.setText("96");
        jPanel1.add(caminho96, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 1550, 50, 40));

        caminho103.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        caminho103.setText("103");
        jPanel1.add(caminho103, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 800, 50, 40));

        Caminho88.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        Caminho88.setText("88");
        jPanel1.add(Caminho88, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 170, 50, 40));

        Sala52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        Sala52.setText("52");
        jPanel1.add(Sala52, new org.netbeans.lib.awtextra.AbsoluteConstraints(1500, 170, 50, 40));

        Sala45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        Sala45.setText("45");
        jPanel1.add(Sala45, new org.netbeans.lib.awtextra.AbsoluteConstraints(1440, 310, 50, 40));

        Xerox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        Xerox.setText("43");
        jPanel1.add(Xerox, new org.netbeans.lib.awtextra.AbsoluteConstraints(1730, 310, 50, 40));

        Sala53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        Sala53.setText("53");
        jPanel1.add(Sala53, new org.netbeans.lib.awtextra.AbsoluteConstraints(1600, 170, 50, 40));

        Sala54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        Sala54.setText("54");
        jPanel1.add(Sala54, new org.netbeans.lib.awtextra.AbsoluteConstraints(1700, 170, 50, 40));

        Sala55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        Sala55.setText("55");
        jPanel1.add(Sala55, new org.netbeans.lib.awtextra.AbsoluteConstraints(1800, 170, 50, 40));

        Sala56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        Sala56.setText("56");
        jPanel1.add(Sala56, new org.netbeans.lib.awtextra.AbsoluteConstraints(1900, 170, 50, 40));

        Sala57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        Sala57.setText("57");
        jPanel1.add(Sala57, new org.netbeans.lib.awtextra.AbsoluteConstraints(2020, 170, 50, 40));

        Caminho90.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        Caminho90.setText("90");
        jPanel1.add(Caminho90, new org.netbeans.lib.awtextra.AbsoluteConstraints(2180, 170, 50, 40));

        Sala59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        Sala59.setText("59");
        jPanel1.add(Sala59, new org.netbeans.lib.awtextra.AbsoluteConstraints(2360, 260, 50, 40));

        pós.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        pós.setText("77");
        jPanel1.add(pós, new org.netbeans.lib.awtextra.AbsoluteConstraints(1860, 310, 50, 40));

        Sala60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        Sala60.setText("60");
        jPanel1.add(Sala60, new org.netbeans.lib.awtextra.AbsoluteConstraints(2460, 260, 50, 40));

        Sala62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        Sala62.setText("62");
        jPanel1.add(Sala62, new org.netbeans.lib.awtextra.AbsoluteConstraints(2660, 260, 50, 40));

        Sala61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        Sala61.setText("61");
        jPanel1.add(Sala61, new org.netbeans.lib.awtextra.AbsoluteConstraints(2570, 260, 50, 40));

        caminho104.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        caminho104.setText("104");
        jPanel1.add(caminho104, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 800, 50, 40));

        cepese.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        cepese.setText("71");
        jPanel1.add(cepese, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 50, 40));

        caminho110.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        caminho110.setText("110");
        jPanel1.add(caminho110, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 1550, 50, 40));

        gralha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        gralha.setText("80");
        jPanel1.add(gralha, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 4020, 50, 40));

        sala18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        sala18.setText("18");
        jPanel1.add(sala18, new org.netbeans.lib.awtextra.AbsoluteConstraints(2180, 1630, 50, 40));

        sala23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        sala23.setText("23");
        jPanel1.add(sala23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1760, 3610, 50, 40));

        banheiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        banheiro.setText("85");
        jPanel1.add(banheiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(1760, 3530, 50, 40));

        sala22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        sala22.setText("22");
        jPanel1.add(sala22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1760, 3470, 50, 40));

        sala21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        sala21.setText("21");
        jPanel1.add(sala21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1760, 3380, 50, 40));

        caminho122.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        caminho122.setText("122");
        jPanel1.add(caminho122, new org.netbeans.lib.awtextra.AbsoluteConstraints(1760, 3330, 50, 40));

        sala20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        sala20.setText("20");
        jPanel1.add(sala20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1760, 3210, 50, 40));

        sala68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        sala68.setText("68");
        jPanel1.add(sala68, new org.netbeans.lib.awtextra.AbsoluteConstraints(1670, 3070, 50, 40));

        sala69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        sala69.setText("69");
        jPanel1.add(sala69, new org.netbeans.lib.awtextra.AbsoluteConstraints(1750, 3070, 40, 40));

        sala70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        sala70.setText("70");
        jPanel1.add(sala70, new org.netbeans.lib.awtextra.AbsoluteConstraints(1790, 3070, 30, 40));

        grafica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        grafica.setText("76");
        jPanel1.add(grafica, new org.netbeans.lib.awtextra.AbsoluteConstraints(2000, 2740, 50, 40));

        museu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        museu.setText("75");
        jPanel1.add(museu, new org.netbeans.lib.awtextra.AbsoluteConstraints(1480, 2820, 50, 40));

        fundosdce.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        fundosdce.setText("74");
        jPanel1.add(fundosdce, new org.netbeans.lib.awtextra.AbsoluteConstraints(1480, 2610, 50, 40));

        sala64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        sala64.setText("64");
        jPanel1.add(sala64, new org.netbeans.lib.awtextra.AbsoluteConstraints(2070, 2220, 50, 40));

        sala63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        sala63.setText("63");
        jPanel1.add(sala63, new org.netbeans.lib.awtextra.AbsoluteConstraints(1900, 2220, 50, 40));

        caminho113.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        caminho113.setText("113");
        jPanel1.add(caminho113, new org.netbeans.lib.awtextra.AbsoluteConstraints(1790, 2220, 50, 40));

        caminho119.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        caminho119.setText("119");
        jPanel1.add(caminho119, new org.netbeans.lib.awtextra.AbsoluteConstraints(2010, 3130, 50, 40));

        caminho120.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        caminho120.setText("120");
        jPanel1.add(caminho120, new org.netbeans.lib.awtextra.AbsoluteConstraints(1760, 3130, 50, 40));

        caminho123.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        caminho123.setText("123");
        jPanel1.add(caminho123, new org.netbeans.lib.awtextra.AbsoluteConstraints(1480, 3480, 50, 40));

        sala65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        sala65.setText("65");
        jPanel1.add(sala65, new org.netbeans.lib.awtextra.AbsoluteConstraints(2240, 2220, 50, 40));

        sala66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        sala66.setText("66");
        jPanel1.add(sala66, new org.netbeans.lib.awtextra.AbsoluteConstraints(2410, 2220, 50, 40));

        sala67.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        sala67.setText("67");
        jPanel1.add(sala67, new org.netbeans.lib.awtextra.AbsoluteConstraints(2570, 2220, 50, 40));

        Sala44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        Sala44.setText("44");
        jPanel1.add(Sala44, new org.netbeans.lib.awtextra.AbsoluteConstraints(1540, 310, 50, 40));

        Cozinha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        Cozinha.setText("78");
        jPanel1.add(Cozinha, new org.netbeans.lib.awtextra.AbsoluteConstraints(1640, 310, 50, 40));

        Caminho91.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        Caminho91.setText("91");
        jPanel1.add(Caminho91, new org.netbeans.lib.awtextra.AbsoluteConstraints(2280, 170, 50, 40));

        Caminho92.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        Caminho92.setText("92");
        jPanel1.add(Caminho92, new org.netbeans.lib.awtextra.AbsoluteConstraints(2280, 260, 50, 40));

        Sala58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        Sala58.setText("58");
        jPanel1.add(Sala58, new org.netbeans.lib.awtextra.AbsoluteConstraints(2100, 170, 50, 40));

        Caminho89.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        Caminho89.setText("89");
        jPanel1.add(Caminho89, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 310, 50, 40));

        Caminho93.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        Caminho93.setText("93");
        jPanel1.add(Caminho93, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 570, 50, 40));

        Sala51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        Sala51.setText("51");
        jPanel1.add(Sala51, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 170, 50, 40));

        caminho107.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        caminho107.setText("107");
        jPanel1.add(caminho107, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 420, 50, 40));

        auditorioberton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        auditorioberton.setText("48");
        jPanel1.add(auditorioberton, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 240, 50, 40));

        caminho102.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        caminho102.setText("102");
        jPanel1.add(caminho102, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 800, 50, 40));

        biblioteca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        biblioteca.setText("2");
        jPanel1.add(biblioteca, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 920, 50, 40));

        almoxarifado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        almoxarifado.setText("72");
        jPanel1.add(almoxarifado, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 590, 50, 40));

        caminho111.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        caminho111.setText("111");
        jPanel1.add(caminho111, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 1550, 50, 40));

        direcao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        direcao.setText("4");
        jPanel1.add(direcao, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 1550, 50, 40));

        coordenacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        coordenacao.setText("3");
        jPanel1.add(coordenacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 970, 50, 40));

        caminho98.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        caminho98.setText("98");
        jPanel1.add(caminho98, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 1480, 50, 40));

        caminho97.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        caminho97.setText("97");
        jPanel1.add(caminho97, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 1650, 50, 40));

        caminho94.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        caminho94.setText("94");
        jPanel1.add(caminho94, new org.netbeans.lib.awtextra.AbsoluteConstraints(1720, 1300, 50, 40));

        caminho99.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        caminho99.setText("99");
        jPanel1.add(caminho99, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 1310, 50, 40));

        caminho100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        caminho100.setText("100");
        jPanel1.add(caminho100, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 1100, 50, 40));

        caminho101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        caminho101.setText("101");
        jPanel1.add(caminho101, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 1100, 50, 40));

        caminho108.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        caminho108.setText("108");
        jPanel1.add(caminho108, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 1310, 50, 40));

        sala13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        sala13.setText("13");
        jPanel1.add(sala13, new org.netbeans.lib.awtextra.AbsoluteConstraints(2120, 1300, 50, 40));

        banheiro84.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        banheiro84.setText("84");
        jPanel1.add(banheiro84, new org.netbeans.lib.awtextra.AbsoluteConstraints(1990, 2350, 50, 40));

        caminho115.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        caminho115.setText("115");
        jPanel1.add(caminho115, new org.netbeans.lib.awtextra.AbsoluteConstraints(2000, 2520, 50, 40));

        dce.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        dce.setText("5");
        jPanel1.add(dce, new org.netbeans.lib.awtextra.AbsoluteConstraints(1840, 2520, 50, 40));

        caminho116.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        caminho116.setText("116");
        jPanel1.add(caminho116, new org.netbeans.lib.awtextra.AbsoluteConstraints(1660, 2520, 50, 40));

        caminho114.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        caminho114.setText("114");
        jPanel1.add(caminho114, new org.netbeans.lib.awtextra.AbsoluteConstraints(1990, 2220, 50, 40));

        caminho117.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        caminho117.setText("117");
        jPanel1.add(caminho117, new org.netbeans.lib.awtextra.AbsoluteConstraints(2000, 2900, 50, 40));

        caminho118.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        caminho118.setText("118");
        jPanel1.add(caminho118, new org.netbeans.lib.awtextra.AbsoluteConstraints(1480, 2900, 50, 40));

        caminho125.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        caminho125.setText("125");
        jPanel1.add(caminho125, new org.netbeans.lib.awtextra.AbsoluteConstraints(1480, 3780, 50, 40));

        caminho121.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        caminho121.setText("121");
        jPanel1.add(caminho121, new org.netbeans.lib.awtextra.AbsoluteConstraints(1470, 3130, 50, 40));

        sala19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        sala19.setText("19");
        jPanel1.add(sala19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1530, 3340, 50, 40));

        caminho124.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        caminho124.setText("124");
        jPanel1.add(caminho124, new org.netbeans.lib.awtextra.AbsoluteConstraints(1480, 3550, 50, 40));

        caminho127.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        caminho127.setText("127");
        jPanel1.add(caminho127, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 3780, 50, 40));

        caminho112.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        caminho112.setText("112");
        jPanel1.add(caminho112, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 3780, 50, 40));

        caminho126.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        caminho126.setText("126");
        jPanel1.add(caminho126, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 3780, 50, 40));

        caminho86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        caminho86.setText("86");
        jPanel1.add(caminho86, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 3780, 50, 40));

        caminho109.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        caminho109.setText("109");
        jPanel1.add(caminho109, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 1310, 50, 40));

        ceetur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        ceetur.setText("73");
        jPanel1.add(ceetur, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 800, 50, 40));

        ficharu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Preto.png"))); // NOI18N
        ficharu.setText("79");
        jPanel1.add(ficharu, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 420, 50, 40));

        jButton1.setText("SALA 50");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 120, -1, -1));

        jButton2.setText("SALA 51");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 120, -1, -1));

        jButton3.setText("SALA 52");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1490, 120, -1, -1));

        jButton4.setText("SALA 53");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1580, 120, -1, -1));

        jButton5.setText("SALA 54");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1690, 120, -1, -1));

        jButton6.setText("SALA 55");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1790, 120, -1, -1));

        jButton7.setText("SALA 56");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1890, 120, -1, -1));

        jButton8.setText("SALA 57");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1980, 120, -1, -1));

        jButton9.setText("SALA 58");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(2090, 120, -1, -1));

        jButton10.setText("SALA 59");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(2350, 200, -1, -1));

        jButton11.setText("SALA 60");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(2450, 200, -1, -1));

        jButton12.setText("SALA 61");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(2550, 200, -1, -1));

        jButton13.setText("SALA 62");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(2650, 200, -1, -1));

        jButton14.setText("CEPESE");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, -1, -1));

        jButton15.setText("R.U.");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 300, -1, -1));

        jButton16.setText("SALA 49");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 180, -1, -1));

        jButton17.setText("AUDITÓRIO BERTON");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 280, -1, -1));

        jButton18.setText("BANHEIRO");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 330, -1, -1));

        jButton19.setText("SALA 47");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 250, -1, -1));

        jButton20.setText("SALA 46");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 250, -1, -1));

        jButton21.setText("SALA 45");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 250, -1, -1));

        jButton22.setText("SALA 44");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1520, 250, -1, -1));

        jButton23.setText("XEROX");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1720, 250, -1, -1));

        jButton24.setText("PÓS");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(1850, 250, -1, -1));

        jButton25.setText("FICHA R.U.");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 500, -1, -1));

        jButton26.setText("ALMOXAFIRADO");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 600, -1, -1));

        jButton27.setText("CEETUR");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 700, -1, -1));

        jButton28.setText("SALA 42");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton28, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 500, -1, -1));

        jButton29.setText("SALA 40");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton29, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 500, -1, -1));

        jButton30.setText("SALA 38");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton30, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 500, -1, -1));

        jButton31.setText("SALA 41");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton31, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 670, -1, -1));

        jButton32.setText("SALA 39");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton32, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 670, -1, -1));

        jButton33.setText("BIBLIOTECA");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton33, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 940, -1, -1));

        jButton34.setText("COORDENAÇÃO");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton34, new org.netbeans.lib.awtextra.AbsoluteConstraints(1490, 940, -1, -1));

        jButton35.setText("BANHEIRO");
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton35, new org.netbeans.lib.awtextra.AbsoluteConstraints(1620, 870, -1, -1));

        jButton36.setText("SALA 36");
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton36, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 500, -1, -1));

        jButton37.setText("SALA 34");
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton37, new org.netbeans.lib.awtextra.AbsoluteConstraints(1530, 500, -1, -1));

        jButton38.setText("SALA 32");
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton38, new org.netbeans.lib.awtextra.AbsoluteConstraints(1620, 500, -1, -1));

        jButton39.setText("SALA 37");
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton39, new org.netbeans.lib.awtextra.AbsoluteConstraints(1430, 670, -1, -1));

        jButton40.setText("SALA 35");
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton40, new org.netbeans.lib.awtextra.AbsoluteConstraints(1530, 670, -1, -1));

        jButton41.setText("SALA 33");
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton41, new org.netbeans.lib.awtextra.AbsoluteConstraints(1620, 670, -1, -1));

        jButton42.setText("SALA 31");
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton42, new org.netbeans.lib.awtextra.AbsoluteConstraints(1810, 430, -1, -1));

        jButton43.setText("SALA 30");
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton43, new org.netbeans.lib.awtextra.AbsoluteConstraints(1800, 570, -1, -1));

        jButton44.setText("SALA 29");
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton44, new org.netbeans.lib.awtextra.AbsoluteConstraints(1800, 700, -1, -1));

        jButton45.setText("SALA 28");
        jButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton45ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton45, new org.netbeans.lib.awtextra.AbsoluteConstraints(1800, 810, -1, -1));

        jButton46.setText("SALA 27");
        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton46, new org.netbeans.lib.awtextra.AbsoluteConstraints(1800, 900, -1, -1));

        jButton47.setText("SALA 26");
        jButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton47ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton47, new org.netbeans.lib.awtextra.AbsoluteConstraints(1800, 1010, -1, -1));

        jButton48.setText("SALA 25");
        jButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton48ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton48, new org.netbeans.lib.awtextra.AbsoluteConstraints(1800, 1120, -1, -1));

        jButton49.setText("SALA DE REUNIÕES");
        jButton49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton49ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton49, new org.netbeans.lib.awtextra.AbsoluteConstraints(1800, 1220, -1, -1));

        jButton50.setText("SALA 13");
        jButton50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton50ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton50, new org.netbeans.lib.awtextra.AbsoluteConstraints(2050, 1220, -1, -1));

        jButton51.setText("SALA 14");
        jButton51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton51ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton51, new org.netbeans.lib.awtextra.AbsoluteConstraints(2270, 1210, -1, -1));

        jButton52.setText("SALA 15");
        jButton52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton52ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton52, new org.netbeans.lib.awtextra.AbsoluteConstraints(2280, 1370, -1, -1));

        jButton53.setText("BANHEIRO");
        jButton53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton53ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton53, new org.netbeans.lib.awtextra.AbsoluteConstraints(2280, 1500, -1, -1));

        jButton54.setText("SALA 18");
        jButton54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton54ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton54, new org.netbeans.lib.awtextra.AbsoluteConstraints(2270, 1610, -1, -1));

        jButton55.setText("SALA 16");
        jButton55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton55ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton55, new org.netbeans.lib.awtextra.AbsoluteConstraints(2050, 1410, -1, -1));

        jButton56.setText("SALA 17");
        jButton56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton56ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton56, new org.netbeans.lib.awtextra.AbsoluteConstraints(2060, 1600, -1, -1));

        jButton57.setText("LABORATÓRIO DE LÍNGUAS");
        jButton57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton57ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton57, new org.netbeans.lib.awtextra.AbsoluteConstraints(1780, 1410, -1, -1));

        jButton58.setText("SALA 10");
        jButton58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton58ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton58, new org.netbeans.lib.awtextra.AbsoluteConstraints(1820, 1550, -1, -1));

        jButton59.setText("SALA 8");
        jButton59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton59ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton59, new org.netbeans.lib.awtextra.AbsoluteConstraints(1630, 1630, -1, -1));

        jButton60.setText("SALA 7");
        jButton60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton60ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton60, new org.netbeans.lib.awtextra.AbsoluteConstraints(1430, 1630, -1, -1));

        jButton61.setText("SALA 6");
        jButton61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton61ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton61, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 1630, -1, -1));

        jButton62.setText("DIREÇÃO");
        jButton62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton62ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton62, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 1630, -1, -1));

        jButton63.setText("SALA 63");
        jButton63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton63ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton63, new org.netbeans.lib.awtextra.AbsoluteConstraints(1860, 2150, -1, -1));

        jButton64.setText("SALA 64");
        jButton64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton64ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton64, new org.netbeans.lib.awtextra.AbsoluteConstraints(2050, 2150, -1, -1));

        jButton65.setText("SALA 65");
        jButton65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton65ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton65, new org.netbeans.lib.awtextra.AbsoluteConstraints(2210, 2150, -1, -1));

        jButton66.setText("SALA 66");
        jButton66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton66ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton66, new org.netbeans.lib.awtextra.AbsoluteConstraints(2390, 2150, -1, -1));

        jButton67.setText("SALA 67");
        jButton67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton67ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton67, new org.netbeans.lib.awtextra.AbsoluteConstraints(2550, 2150, -1, -1));

        jButton68.setText("BANHEIRO");
        jButton68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton68ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton68, new org.netbeans.lib.awtextra.AbsoluteConstraints(1870, 2340, -1, -1));

        jButton69.setText("DCE");
        jButton69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton69ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton69, new org.netbeans.lib.awtextra.AbsoluteConstraints(1840, 2590, -1, -1));

        jButton70.setText("DCE FUNDOS");
        jButton70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton70ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton70, new org.netbeans.lib.awtextra.AbsoluteConstraints(1540, 2620, -1, -1));

        jButton71.setText("GRÁFICA");
        jButton71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton71ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton71, new org.netbeans.lib.awtextra.AbsoluteConstraints(1900, 2750, -1, -1));

        jButton72.setText("MUSEU");
        jButton72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton72ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton72, new org.netbeans.lib.awtextra.AbsoluteConstraints(1540, 2830, -1, -1));

        jButton73.setText("SALA 68");
        jButton73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton73ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton73, new org.netbeans.lib.awtextra.AbsoluteConstraints(1550, 3050, -1, -1));

        jButton74.setText("SALA 69");
        jButton74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton74ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton74, new org.netbeans.lib.awtextra.AbsoluteConstraints(1710, 3000, -1, -1));

        jButton75.setText("SALA 70");
        jButton75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton75ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton75, new org.netbeans.lib.awtextra.AbsoluteConstraints(1870, 3030, -1, -1));

        jButton76.setText("SALA 19");
        jButton76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton76ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton76, new org.netbeans.lib.awtextra.AbsoluteConstraints(1570, 3260, -1, -1));

        jButton77.setText("SALA 20");
        jButton77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton77ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton77, new org.netbeans.lib.awtextra.AbsoluteConstraints(1850, 3230, -1, -1));

        jButton78.setText("SALA 21");
        jButton78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton78ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton78, new org.netbeans.lib.awtextra.AbsoluteConstraints(1850, 3380, -1, -1));

        jButton79.setText("BANHEIRO");
        jButton79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton79ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton79, new org.netbeans.lib.awtextra.AbsoluteConstraints(1860, 3510, -1, -1));

        jButton80.setText("SALA 24");
        jButton80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton80ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton80, new org.netbeans.lib.awtextra.AbsoluteConstraints(1850, 3640, -1, -1));

        jButton81.setText("SALA 22");
        jButton81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton81ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton81, new org.netbeans.lib.awtextra.AbsoluteConstraints(1650, 3480, -1, -1));

        jButton82.setText("SALA 23");
        jButton82.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton82ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton82, new org.netbeans.lib.awtextra.AbsoluteConstraints(1660, 3620, -1, -1));

        jButton83.setText("AUDITÓRIO GRALHA");
        jButton83.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton83ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton83, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 4020, -1, -1));

        Entrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaActionPerformed(evt);
            }
        });
        Entrada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                EntradaKeyTyped(evt);
            }
        });
        jPanel1.add(Entrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 110, 30));

        Saida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaidaActionPerformed(evt);
            }
        });
        Saida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SaidaKeyPressed(evt);
            }
        });
        jPanel1.add(Saida, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 100, 30));

        jButton84.setText("OK");
        jButton84.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton84ActionPerformed(evt);
            }
        });
        jButton84.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton84KeyPressed(evt);
            }
        });
        jPanel1.add(jButton84, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        jButton85.setText("RESET");
        jButton85.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton85ActionPerformed(evt);
            }
        });
        jButton85.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton85KeyPressed(evt);
            }
        });
        jPanel1.add(jButton85, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, -1));

        jButton86.setText("EXIT");
        jButton86.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton86ActionPerformed(evt);
            }
        });
        jButton86.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton86KeyPressed(evt);
            }
        });
        jPanel1.add(jButton86, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, -1, -1));

        cadeirante.setText("Wheelchair");
        cadeirante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadeiranteActionPerformed(evt);
            }
        });
        jPanel1.add(cadeirante, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 120, 90, -1));

        jButton87.setText("CLEAR");
        jButton87.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton87ActionPerformed(evt);
            }
        });
        jButton87.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton87KeyPressed(evt);
            }
        });
        jPanel1.add(jButton87, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 70, 80, -1));

        jButton88.setText("C");
        jButton88.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton88ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton88, new org.netbeans.lib.awtextra.AbsoluteConstraints(1630, 250, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/rampa.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 1580, 190, 310));
        jPanel1.add(Distancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 70, -1));

        jLabel3.setText("Distance:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/mapa_fecea 1.0.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 685));

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("EXIT");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("CLEAR");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("RESET");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu4.setText("Help");
        jMenu4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenu4KeyPressed(evt);
            }
        });

        jMenuItem4.setText("Help Contents");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        jMenuItem5.setText("About");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem5);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 
        Checker(50);
        Road(a,b);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton86ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton86ActionPerformed
         System.exit(0);
    }//GEN-LAST:event_jButton86ActionPerformed

    private void jButton84ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton84ActionPerformed
        parameter();                    
    }//GEN-LAST:event_jButton84ActionPerformed

    private void jButton85ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton85ActionPerformed
      Reset(1);
    }//GEN-LAST:event_jButton85ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        Checker(71);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        Checker(1);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed

        Checker(79);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed

        Checker(48);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed

        Checker(49);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        Checker(51);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        Checker(52);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        Checker(53);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
 
        Checker(54);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        Checker(55);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        Checker(56);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
 
        Checker(57);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

        Checker(58);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

        Checker(59);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed

        Checker(60);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed

        Checker(61);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
   
        Checker(62);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
  
        Checker(81);
        Road(a,b);
                if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed

        Checker(47);
        Road(a,b);
                if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
 
        Checker(46);
        Road(a,b);
                if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed

        Checker(45);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
 
        Checker(44);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
  
        Checker(43);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
  
        Checker(77);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed

        Checker(31);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton42ActionPerformed

    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed
   
        Checker(30);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton43ActionPerformed

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
   
        Checker(29);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton44ActionPerformed

    private void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton45ActionPerformed
 
        Checker(28);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton45ActionPerformed

    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton46ActionPerformed
      
        Checker(27);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton46ActionPerformed

    private void jButton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton47ActionPerformed

        Checker(26);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton47ActionPerformed

    private void jButton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton48ActionPerformed

        Checker(25);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton48ActionPerformed

    private void jButton49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton49ActionPerformed
    
        Checker(11);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton49ActionPerformed

    private void jButton57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton57ActionPerformed

        Checker(11);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton57ActionPerformed

    private void jButton50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton50ActionPerformed

        Checker(13);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton50ActionPerformed

    private void jButton51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton51ActionPerformed
        
        Checker(14);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton51ActionPerformed

    private void jButton52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton52ActionPerformed
        
        Checker(15);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton52ActionPerformed

    private void jButton55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton55ActionPerformed
       
        Checker(16);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton55ActionPerformed

    private void jButton53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton53ActionPerformed
       
        Checker(82);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton53ActionPerformed

    private void jButton56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton56ActionPerformed
    
        Checker(17);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton56ActionPerformed

    private void jButton54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton54ActionPerformed
       
        Checker(18);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton54ActionPerformed

    private void jButton87ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton87ActionPerformed
        clean();
        a = 0;
        b = 0;
    }//GEN-LAST:event_jButton87ActionPerformed

    private void jButton58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton58ActionPerformed
        Checker(10);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton58ActionPerformed

    private void jButton59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton59ActionPerformed
        Checker(8);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton59ActionPerformed

    private void jButton60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton60ActionPerformed
       Checker(7);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton60ActionPerformed

    private void jButton61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton61ActionPerformed
        Checker(6);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton61ActionPerformed

    private void jButton62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton62ActionPerformed
        Checker(4);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton62ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        Checker(73);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        Checker(72);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        Checker(41);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        Checker(42);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        Checker(40);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        Checker(38);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        Checker(39);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        Checker(36);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        Checker(34);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        Checker(32);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        Checker(36);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton39ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        Checker(34);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton40ActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
        Checker(32);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton41ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        Checker(83);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        Checker(2);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        Checker(3);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton83ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton83ActionPerformed
        Checker(80);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton83ActionPerformed

    private void jButton76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton76ActionPerformed
        Checker(19);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton76ActionPerformed

    private void jButton77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton77ActionPerformed
        Checker(20);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton77ActionPerformed

    private void jButton78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton78ActionPerformed
        Checker(21);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton78ActionPerformed

    private void jButton81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton81ActionPerformed
        Checker(22);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton81ActionPerformed

    private void jButton82ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton82ActionPerformed
        Checker(23);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton82ActionPerformed

    private void jButton80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton80ActionPerformed
        Checker(24);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton80ActionPerformed

    private void jButton79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton79ActionPerformed
        Checker(85);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton79ActionPerformed

    private void jButton73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton73ActionPerformed
        Checker(68);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton73ActionPerformed

    private void jButton74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton74ActionPerformed
        Checker(69);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton74ActionPerformed

    private void jButton75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton75ActionPerformed
        Checker(70);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton75ActionPerformed

    private void jButton72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton72ActionPerformed
        Checker(75);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton72ActionPerformed

    private void jButton71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton71ActionPerformed
        Checker(76);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton71ActionPerformed

    private void jButton70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton70ActionPerformed
        Checker(74);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton70ActionPerformed

    private void jButton69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton69ActionPerformed
        Checker(5);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton69ActionPerformed

    private void jButton68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton68ActionPerformed
        Checker(84);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton68ActionPerformed

    private void jButton63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton63ActionPerformed
        Checker(63);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton63ActionPerformed

    private void jButton64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton64ActionPerformed
        Checker(64);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton64ActionPerformed

    private void jButton65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton65ActionPerformed
        Checker(65);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton65ActionPerformed

    private void jButton66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton66ActionPerformed
        Checker(66);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton66ActionPerformed

    private void jButton88ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton88ActionPerformed
        Checker(78);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton88ActionPerformed

    private void SaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SaidaActionPerformed

    private void EntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaActionPerformed

    private void jButton84KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton84KeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            parameter();
        }
    }//GEN-LAST:event_jButton84KeyPressed

    private void SaidaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SaidaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            parameter();
        }
    }//GEN-LAST:event_SaidaKeyPressed

    private void jButton87KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton87KeyPressed
        clean();
        a = 0;
        b = 0;
    }//GEN-LAST:event_jButton87KeyPressed

    private void jButton85KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton85KeyPressed
         Reset(1);
    }//GEN-LAST:event_jButton85KeyPressed

    private void jButton86KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton86KeyPressed
        System.exit(0);
    }//GEN-LAST:event_jButton86KeyPressed

    private void cadeiranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadeiranteActionPerformed
        
        JCheckBox cadeirante = new JCheckBox();
       
    }//GEN-LAST:event_cadeiranteActionPerformed

    private void jButton67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton67ActionPerformed
        Checker(67);
        Road(a,b);
        if (a != 0 && b != 0){
        a = 0;
        b = 0;
        }
    }//GEN-LAST:event_jButton67ActionPerformed

    private void EntradaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EntradaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaKeyTyped

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenu4KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu4KeyPressed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        clean();
        a = 0;
        b = 0;
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        new HelpMenu().setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Reset(1);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        new AboutMenu().setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        int Distancia = getWidth() - jScrollPane1.getWidth(); 
        jScrollPane1.setSize(getWidth()-Distancia+20 , getHeight()-60); 
        jScrollPane1.setLocation(Distancia/2,0);
    }//GEN-LAST:event_formComponentResized

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Mapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mapa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Banheiro81;
    private javax.swing.JLabel Brinquedoteca;
    private javax.swing.JLabel Caminho88;
    private javax.swing.JLabel Caminho89;
    private javax.swing.JLabel Caminho90;
    private javax.swing.JLabel Caminho91;
    private javax.swing.JLabel Caminho92;
    private javax.swing.JLabel Caminho93;
    private javax.swing.JLabel Cozinha;
    private javax.swing.JTextField Distancia;
    private javax.swing.JTextField Entrada;
    private javax.swing.JTextField Saida;
    private javax.swing.JLabel Sala30;
    private javax.swing.JLabel Sala31;
    private javax.swing.JLabel Sala32;
    private javax.swing.JLabel Sala34;
    private javax.swing.JLabel Sala36;
    private javax.swing.JLabel Sala38;
    private javax.swing.JLabel Sala39;
    private javax.swing.JLabel Sala40;
    private javax.swing.JLabel Sala41;
    private javax.swing.JLabel Sala42;
    private javax.swing.JLabel Sala44;
    private javax.swing.JLabel Sala45;
    private javax.swing.JLabel Sala46;
    private javax.swing.JLabel Sala47;
    private javax.swing.JLabel Sala49;
    private javax.swing.JLabel Sala50;
    private javax.swing.JLabel Sala51;
    private javax.swing.JLabel Sala52;
    private javax.swing.JLabel Sala53;
    private javax.swing.JLabel Sala54;
    private javax.swing.JLabel Sala55;
    private javax.swing.JLabel Sala56;
    private javax.swing.JLabel Sala57;
    private javax.swing.JLabel Sala58;
    private javax.swing.JLabel Sala59;
    private javax.swing.JLabel Sala60;
    private javax.swing.JLabel Sala61;
    private javax.swing.JLabel Sala62;
    private javax.swing.JLabel Xerox;
    private javax.swing.JLabel almoxarifado;
    private javax.swing.JLabel auditorioberton;
    private javax.swing.JLabel banheiro;
    private javax.swing.JLabel banheiro82;
    private javax.swing.JLabel banheiro83;
    private javax.swing.JLabel banheiro84;
    private javax.swing.JLabel biblioteca;
    private javax.swing.JCheckBox cadeirante;
    private javax.swing.JLabel caminho100;
    private javax.swing.JLabel caminho101;
    private javax.swing.JLabel caminho102;
    private javax.swing.JLabel caminho103;
    private javax.swing.JLabel caminho104;
    private javax.swing.JLabel caminho105;
    private javax.swing.JLabel caminho106;
    private javax.swing.JLabel caminho107;
    private javax.swing.JLabel caminho108;
    private javax.swing.JLabel caminho109;
    private javax.swing.JLabel caminho110;
    private javax.swing.JLabel caminho111;
    private javax.swing.JLabel caminho112;
    private javax.swing.JLabel caminho113;
    private javax.swing.JLabel caminho114;
    private javax.swing.JLabel caminho115;
    private javax.swing.JLabel caminho116;
    private javax.swing.JLabel caminho117;
    private javax.swing.JLabel caminho118;
    private javax.swing.JLabel caminho119;
    private javax.swing.JLabel caminho120;
    private javax.swing.JLabel caminho121;
    private javax.swing.JLabel caminho122;
    private javax.swing.JLabel caminho123;
    private javax.swing.JLabel caminho124;
    private javax.swing.JLabel caminho125;
    private javax.swing.JLabel caminho126;
    private javax.swing.JLabel caminho127;
    private javax.swing.JLabel caminho86;
    private javax.swing.JLabel caminho94;
    private javax.swing.JLabel caminho95;
    private javax.swing.JLabel caminho96;
    private javax.swing.JLabel caminho97;
    private javax.swing.JLabel caminho98;
    private javax.swing.JLabel caminho99;
    private javax.swing.JLabel ceetur;
    private javax.swing.JLabel cepese;
    private javax.swing.JLabel coordenacao;
    private javax.swing.JLabel dce;
    private javax.swing.JLabel direcao;
    private javax.swing.JLabel ficharu;
    private javax.swing.JLabel fundosdce;
    private javax.swing.JLabel grafica;
    private javax.swing.JLabel gralha;
    private javax.swing.JLabel helidbudian;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton51;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton53;
    private javax.swing.JButton jButton54;
    private javax.swing.JButton jButton55;
    private javax.swing.JButton jButton56;
    private javax.swing.JButton jButton57;
    private javax.swing.JButton jButton58;
    private javax.swing.JButton jButton59;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton60;
    private javax.swing.JButton jButton61;
    private javax.swing.JButton jButton62;
    private javax.swing.JButton jButton63;
    private javax.swing.JButton jButton64;
    private javax.swing.JButton jButton65;
    private javax.swing.JButton jButton66;
    private javax.swing.JButton jButton67;
    private javax.swing.JButton jButton68;
    private javax.swing.JButton jButton69;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton70;
    private javax.swing.JButton jButton71;
    private javax.swing.JButton jButton72;
    private javax.swing.JButton jButton73;
    private javax.swing.JButton jButton74;
    private javax.swing.JButton jButton75;
    private javax.swing.JButton jButton76;
    private javax.swing.JButton jButton77;
    private javax.swing.JButton jButton78;
    private javax.swing.JButton jButton79;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton80;
    private javax.swing.JButton jButton81;
    private javax.swing.JButton jButton82;
    private javax.swing.JButton jButton83;
    private javax.swing.JButton jButton84;
    private javax.swing.JButton jButton85;
    private javax.swing.JButton jButton86;
    private javax.swing.JButton jButton87;
    private javax.swing.JButton jButton88;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel museu;
    private javax.swing.JLabel pós;
    private javax.swing.JLabel ru;
    private javax.swing.JLabel sala10;
    private javax.swing.JLabel sala13;
    private javax.swing.JLabel sala14;
    private javax.swing.JLabel sala15;
    private javax.swing.JLabel sala16;
    private javax.swing.JLabel sala17;
    private javax.swing.JLabel sala18;
    private javax.swing.JLabel sala19;
    private javax.swing.JLabel sala20;
    private javax.swing.JLabel sala21;
    private javax.swing.JLabel sala22;
    private javax.swing.JLabel sala23;
    private javax.swing.JLabel sala24;
    private javax.swing.JLabel sala25;
    private javax.swing.JLabel sala26;
    private javax.swing.JLabel sala27;
    private javax.swing.JLabel sala28;
    private javax.swing.JLabel sala6;
    private javax.swing.JLabel sala63;
    private javax.swing.JLabel sala64;
    private javax.swing.JLabel sala65;
    private javax.swing.JLabel sala66;
    private javax.swing.JLabel sala67;
    private javax.swing.JLabel sala68;
    private javax.swing.JLabel sala69;
    private javax.swing.JLabel sala7;
    private javax.swing.JLabel sala70;
    private javax.swing.JLabel sala8;
    // End of variables declaration//GEN-END:variables
}
