package wyrmgard.wyrmgard;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.GridLayout;


public class WyrmgardAdventure {

    JFrame window;
    Container con;
    JPanel titleCreditsPanel, titleNamePanel, startButtonPanel,mainTextPanel, choiceButtonPanel, playerPanel;
    JLabel titleCreditsLabel, titleNameLabel, hpLabel,hpLabelNumber, weaponLabel,weaponLabelName, armorLabel, armorLabelName;
    JButton startButton, choice1, choice2, choice3, choice4;
    Font titleFont = new Font("Times New Roman", Font.PLAIN, 90);
    Font normalFont = new Font("Times New Roman", Font.PLAIN, 20);
    Font mainText = new Font ("Times New Roman", Font.PLAIN, 20);
    Font creditsFont = new Font("Times New Roman", Font.PLAIN, 20);
    Font hpAndWeapon = new Font ("Times New Roman", Font.PLAIN, 40);
    TitleScreenHandler tsHandler = new TitleScreenHandler();
    JTextArea mainTextArea;
    int playerHP, monsterHP, silverKey, holz, teddybär, initiative, goblinKopf, eheRing;
    String weapon, position, armor;
    
    
    
    ChoiceHandler choiceHandler = new ChoiceHandler();
    
    public static void main(String[] args) {
        
       new WyrmgardAdventure();
        
    }
    
    public WyrmgardAdventure(){
        
        ////////////////////Titelbild///////////////////////
        
        window = new JFrame();
        window.setSize(1000,600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);
        window.setVisible(true);
        con = window.getContentPane();
        window.setResizable(false);
        
        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(200,100,600,150);
        titleNamePanel.setBackground(Color.black);
        
        titleNameLabel = new JLabel("Wyrmgard");
        titleNameLabel.setForeground(Color.white);
        titleNameLabel.setFont(titleFont);
        
        titleCreditsPanel = new JPanel();
        titleCreditsPanel.setBounds(300,250,400,150);
        titleCreditsPanel.setBackground(Color.black);
        
        titleCreditsLabel = new JLabel("\n\nText Adventure created by Lars Kastner");
        titleCreditsLabel.setForeground(Color.white);
        titleCreditsLabel.setFont(creditsFont);
        
        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(400,400,200,100);
        startButtonPanel.setBackground(Color.black);
        
        startButton = new JButton("START");
        startButton.setBackground(Color.black);
        startButton.setForeground(Color.white);
        startButton.setFont(normalFont); 
        startButton.addActionListener(tsHandler);
        //entfernt die innere Umrandung des Start Buttons//
        startButton.setFocusable(false);
        
        titleCreditsPanel.add(titleCreditsLabel);
        startButtonPanel.add(startButton);
        titleNamePanel.add(titleNameLabel);
        con.add(startButtonPanel);
        con.add(titleNamePanel);
        con.add(titleCreditsPanel);
        window.setVisible(true);
    }
    
    public void createGameScreen(){
    ///////////Löscht Titelname und den Startknopf/////
        titleNamePanel.setVisible(false);
        startButtonPanel.setVisible(false); 
        titleCreditsPanel.setVisible(false);
    //////////////////////////////////////////////////
        
    mainTextPanel = new JPanel();
    mainTextPanel.setBounds(10,10,1000,220);
    mainTextPanel.setBackground(Color.black);
    con.add(mainTextPanel);
    
    mainTextArea = new JTextArea("Das ist die mainTextArea!!!!!\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nrerg");
    mainTextArea.setBounds(10,10,900,300);
    mainTextArea.setBackground(Color.black);
    mainTextArea.setForeground(Color.white);
    mainTextArea.setFont(mainText);
    mainTextArea.setLineWrap(true);
    mainTextArea.setWrapStyleWord(true);
    mainTextPanel.add(mainTextArea);
            
    choiceButtonPanel = new JPanel();
    choiceButtonPanel.setBounds(425,350,450,200);
    choiceButtonPanel.setBackground(Color.black);
    choiceButtonPanel.setLayout(new GridLayout(4,1));
    con.add(choiceButtonPanel);
    
    choice1 = new JButton("Choice 1");
    choice1.setBackground(Color.black);
    choice1.setForeground(Color.white);
    choice1.setFont(normalFont);
    choiceButtonPanel.add(choice1);
    choice1.addActionListener(choiceHandler);
    choice1.setActionCommand("c1");
    
    choice2 = new JButton("Choice 2");
    choice2.setBackground(Color.black);
    choice2.setForeground(Color.white);
    choice2.setFont(normalFont);
    choiceButtonPanel.add(choice2);
    choice2.addActionListener(choiceHandler);
    choice2.setActionCommand("c2");
    
    choice3 = new JButton("Choice 3");
    choice3.setBackground(Color.black);
    choice3.setForeground(Color.white);
    choice3.setFont(normalFont);
    choiceButtonPanel.add(choice3);
    choice3.addActionListener(choiceHandler);
    choice3.setActionCommand("c3");
    
    choice4 = new JButton("Choice 4");
    choice4.setBackground(Color.black);
    choice4.setForeground(Color.white);
    choice4.setFont(normalFont);
    choiceButtonPanel.add(choice4);
    choice4.addActionListener(choiceHandler);
    choice4.setActionCommand("c4");
    
    playerPanel= new JPanel();
    playerPanel.setBounds(10,250,400,300);
    playerPanel.setBackground(Color.black);
    playerPanel.setLayout(new GridLayout(3,3));
    con.add(playerPanel);
    
    hpLabel= new JLabel("LP:");
    hpLabel.setFont(hpAndWeapon);
    hpLabel.setForeground(Color.white);
    playerPanel.add(hpLabel);
    
    hpLabelNumber= new JLabel();
    hpLabelNumber.setFont(hpAndWeapon);
    hpLabelNumber.setForeground(Color.white);
    playerPanel.add(hpLabelNumber);
            
    weaponLabel = new JLabel("Waffe:");
    weaponLabel.setFont(hpAndWeapon);
    weaponLabel.setForeground(Color.white);
    playerPanel.add(weaponLabel);
    
    weaponLabelName = new JLabel();
    weaponLabelName.setFont(hpAndWeapon);
    weaponLabelName.setForeground(Color.white);
    playerPanel.add(weaponLabelName);
    
    armorLabel= new JLabel("Rüstung:");
    armorLabel.setFont(hpAndWeapon);
    armorLabel.setForeground(Color.white);
    playerPanel.add(armorLabel);
    
    armorLabelName = new JLabel();
    armorLabelName.setFont(hpAndWeapon);
    armorLabelName.setForeground(Color.white);
    playerPanel.add(armorLabelName);
    
    playerSetup();
}
    
    public void playerSetup(){
        
        playerHP = 20;
        monsterHP = 15;
        weapon = "Messer";
        armor = "Nichts";
        hpLabelNumber.setText("" + playerHP);
        weaponLabelName.setText(weapon);
        armorLabelName.setText(armor);
        townGate();
    }
    
    
    ///////////////////////Orte/////////////////////////////////
    public void townGate(){
        position = "townGate";
mainTextArea.setText("Nach einer mehrtägigen Reise durch Wyrmgard kommst du an einem Dorf vorbei, welches den Namen Kaltwacht trägt.\nDu fühlst dich hungrig und deine Füße sind schwer. \n\nDu stehst vor dem Torhaus des Dorfes. Ein großer muskulöser Mann steht vor dir. Seine glänzende Rüstung ist übersät mit Kratzern und Dellen.\n\nWas tust du?");
        
        choice1.setText("Sprich mit der Wache");
        choice2.setText("Greife die Wache an");
        choice3.setText("Weggehen");
        choice4.setText("");
    }
    
    public void townGateFirst(){
        position = "townGateFirst";
        mainTextArea.setText("Du bist wieder am Dorftor. Was machst du?");
        choice1.setText("Sprich mit der Wache");
        choice2.setText("Greife die Wache an");
        choice3.setText("Weggehen");
        choice4.setText("");
    }
    
    public void north(){
        position = "north";
        mainTextArea.setText("Als du in die nördliche Richtung gehst, endet diese Straße an einem Weg der erahnen lässt, dass es die letzten Nächte in strömen geregnet haben muss. Es sind Spuren von einer Kutsche zu sehen, welche vor kurzer Zeit hier lang gefahren sein muss.");
        choice1.setText("Weg Folgen");
        choice2.setText("Weggehen");
        choice3.setText("");
        choice4.setText("");
    }
    
   public void holzFällerHütte(){
       position = "holzFällerHütte";
       mainTextArea.setText("Du folgst der schlammigen Straße und nach einiger Zeit kommst du an einer Hütte an. Der Kamin scheint befeuert zu sein, denn es steigt Rauch aus dem Schornstein.");
        choice1.setText("Annähern");
        choice2.setText("Beobachten");
        choice3.setText("Weggehen");
        choice4.setText("");
   }
   
   public void holzFällerHütteAnnähern(){
       position = "holzFällerHütteAnnähern";
       mainTextArea.setText("Du näherst dich der Hütte. Du stehst schon fast vor der Tür, da fliegt sie auf und ein Bärtiger großer Mann, mit einer Axt in der Hand, kommt hinaus.\nBärtiger Mann: Oh, habt ihr Euch verlaufen?  Ich wollte gerade etwas Feuerholz hacken.");
        choice1.setText("Nein, ich suche nach einer Aufgabe.");
        choice2.setText("Ja, ich würde mich gerne etwas ausruhen.");
        choice3.setText("Weggehen.");
        choice4.setText("");
   }
   
   public void holzFällerBaumFällen(){
       position = "holzFällerBaumFällen";
       mainTextArea.setText("Gerne, ich bräuchte noch mehr Feuerholz. Könntest du hier im angrenzenden Wald noch etwas sammeln ? Ich wollte etwas zu essen machen, so könnte ich schon einmal anfangen. Du bist herzlich eingeladen mit uns zu essen.");
        choice1.setText("Ja, gerne. Ich gehe sofort los.");
        choice2.setText("Nein, Danke.");
        choice3.setText("");
        choice4.setText("");
   }
   
   public void neinDanke(){
       position = "neinDanke";
       mainTextArea.setText("Schade. Dann auf wiedersehen.");
        choice1.setText("Weggehen.");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
   }
   
   public void holzFällerBäumeFällen(){
       position = "holzFällerBäumeFällen";
       mainTextArea.setText("Du gehst in den Wald und ein Goblin läuft dir über den Weg. Er schaut dich erschrocken an und bleibt still stehen.\n Es scheint, als würde er hoffen, dass du ihn noch nicht gesehen hast.");
        choice1.setText("Angreifen");
        choice2.setText("Fliehen");
        choice3.setText("");
        choice4.setText("");
   }
   
   public void holzFällerEssen2(){
       position = "holzFällerEssen2";
       mainTextArea.setText("Ihr seht wirklich erschöpft aus. Geht schon einmal ins Haus. Meine Frau bereitet schon einmal alles vor. Ruht euch etwas aus.");
        choice1.setText("Danke.");
        choice2.setText("Weggehen.");
        choice3.setText("");
        choice4.setText("");
   }
   
   public void essenUndAusruhen(){
       position = "essenUndAusruhen";
       mainTextArea.setText("Ihr ruht euch aus und esst etwas. Ihr fühlt euch gut.\n\n\n(Du erhältst 5 Lebenspunkte.)");
       playerHP = playerHP + 5;
        hpLabelNumber.setText(""+playerHP);
       choice1.setText("Weggehen");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
      
   }
   
   public void holzFällerHütteBeobachten(){
       position = "holzFällerHütteBeobachten";
       mainTextArea.setText("Du gehst neben dem Weg ins Gebüsch und schleichst den Weg weiter entlang. Du siehst einen Mann, der gerade seine Hütte verlässt und Holz hackt.");
        choice1.setText("Annähern.");
        choice2.setText("Angreifen.");
        choice3.setText("Wegschleichen.");
        choice4.setText("");
   }
   
   public void holzFällerMannAnnähern(){
       position = "holzFällerMannAnnähern";
       mainTextArea.setText("Oh grüßt euch. Ihr habt euch also doch aus eurem Versteck gewagt. Wie ich sehe, habt ihr nichts bösartiges vor.\n\n Möchtet Ihr euch ausruhen?");
        choice1.setText("Ja, gerne");
        choice2.setText("Nein, danke.");
        choice3.setText("");
        choice4.setText("");
   }
   
   public void holzFällerMannBedrohen(){
       position = "holzFällerMannBedrohen";
       mainTextArea.setText("Du läufst zum Bärtigen Mann. Er hat euch schon längst bemerkt. Er Dreht sich um und schlägt dir mit einem Hieb den Kopf ab.\n\n\nDu bist gestorben!\n\n<GAME OVER>");
       
       
       
        choice1.setText("");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
        choice1.setVisible(false);
        choice2.setVisible(false);
        choice3.setVisible(false);
        choice4.setVisible(false);
   }
   
 
    
    
    
    public void west(){
        position = "west";
        mainTextArea.setText("Der Weg nach Westen wurde von der Natur längst zurückerobert. Hier ist schon lang niemand mehr langgegangen.");
        choice1.setText("Weiter.");
        choice2.setText("Weggehen.");
        choice3.setText("");
        choice4.setText("");
    
    }
    
    public void schmiede(){
        position = "schmiede";
        mainTextArea.setText("Als du dich der Schmiede näherst, wird das ryhtmische Schlagen auf Metall immer lauter. Thorek der Schmied schlägt das Eisen in eine Form, welches einem Schwert ähnelt.\nSchmied: Hallo Fremder, was führt dich zu meiner Schmiede? ");
        choice1.setText("Ich war nur neugierig.");
        choice2.setText("Ich würde Euch gerne bei der Arbeit zusehen.");
        choice3.setText("benötigen sie hilfe?");
        choice4.setText("Weggehen");
    
    }
    
    
    
    public void taverne(){
        position = "taverne";
        mainTextArea.setText("Du betretest die Taverne. Stickige und Tabak verrauchte Luft schlägt dir ins Gesicht. Hier wurde lang nicht mehr gelüftet. Viele Gäste hat die Taverne zum speckigen Schwein nicht. Zwei Trinker sitzen in der Ecke und spielen ein Würfelspiel. Weiter abseits sitzt ein weiterer Gast, der offensichtlich einen sehr großen Durst besitzt. \n\nDer Wirt kommt hinter der Theke her.\n Wirt: Guten Tag Fremder, mein Name ist Elfond. \n Er macht eine kleine verbeugung.\n Wirt: Wie kann ich Euch dienlich sein? Ihr seht sehr erschöpft aus. Möchtet Ihr ein Zimmer haben? Momentan sind sie Kostenlos zur vermietung. \n\nSie müssen nur rumerzählen, dass Ihnen hier nichts passiert ist.");
        choice1.setText("Gerne, ich möchte mich ausruhen");
        choice2.setText("Zu den Zwei Trinkern gesellen.");
        choice3.setText("Zum Trinker gehen");
        choice4.setText("Weggehen.");
        
    }
    
    

    
    public void taverneAusruhen(){
        position = "taverneAusruhen";
        mainTextArea.setText("\nElfond: Gerne, einfach die Treppe hoch. Sucht Euch ein Zimmer aus. Du schleppst dich die Treppen hoch. Die Stufen knarzen. Spinnenweben zieren den Treppenaufgang. Oben angekommen erstreckt sich ein langer Korridor mit vier Türen. ");
        choice1.setText("Erste Linke Tür");
        choice2.setText("Zweite Linke Tür");
        choice3.setText("Erste Rechte Tür");
        choice4.setText("Zweite Rechte Tür");
    }
    
    public void ausruhen(){
        position = "ausruhen";
        mainTextArea.setText("Ihr murmelt Euch in euer Bett und schlaft ein. \n\n Ein Alptraum plagt euch.\nAls Du erschrocken hochschreckt und die Augen öffnest, siehst du einen bläulichen Nebel der im Zimmer umher schwirrt. \n\nDU MUSST...\n\n... MIR HELFEN!\n ");
        choice1.setText("Wie kann ich dir helfen?");
        choice2.setText("Unter die Decke verkriechen.");
        choice3.setText("");
        choice4.setText("");
    }
    
    public void ausruhen2(){
        position = "ausruhen2";
        mainTextArea.setText("DU MUSST.... DU MUSST... zum Hof.\n\n Hof... Ebenholz.\n BITTE!!!\n\n Ich will endlich schlafen. Für immer. Bring mir bitte meinen Ehering.");
        choice1.setText("Ich werde dir helfen.");
        choice2.setText("Unter die Decke verkriechen.");
        choice3.setText("");
        choice4.setText("");
    }
    
    public void ichWerdeDirHelfenGeist(){
        position = "ichWerdeDirHelfenGeist";
        mainTextArea.setText("Ich danke dir... ");
        choice1.setText("Hinausgehen.");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
                
    }
    
    
    public void unterDieDecke(){
        position = "unterDieDecke";
        mainTextArea.setText("Das Schimmern löst sich auf und der Raum verdunkelt sich.");
        choice1.setText("Hinausgehen.");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
    }
    
    
    
    
    
    public void taverneZweiTrinker(){
        position = "taverneZweiTrinker";
        mainTextArea.setText("Als du dich den Trinkern näherst, merkst du schon, dass sie keine lust auf ein Gespräch mit einem Fremden haben. Sie winken ab und konzentieren sich auf ihr Würfelspiel.");
        choice1.setText("Weggehen.");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
    }
    
    
    public void taverneAlleinigerTrinker(){
        position = "taverneAlleinigerTrinker";
        mainTextArea.setText("Trinker: Trinkt einen mit mir!\n Er hält euch ein Bier entgegen. Es wäre unfreundlich abzulehnen, daher nimmst du es an und ziehst es leer.");
        playerHP= playerHP+ 3;
        hpLabelNumber.setText(""+playerHP);
        choice1.setText("Weggehen.");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
    }
    
    public void zimmerTaverne(){
        position = "zimmerTaverne";
        mainTextArea.setText("Ihr seid auf Eurem Zimmer. Was möchtet Ihr tun?");
        choice1.setText("Ausruhen");
        choice2.setText("In die Schanke");
        choice3.setText("Rausgehen");
        choice4.setText("");
    }
    
    
    
    
    
    public void friedhof(){
        position = "friedhof";
        mainTextArea.setText("Du kommst dem Friedhof immer näher und die Bäume verdichten sich immer mehr. Die Straße wird immer düsterer. Die Büsche links und rechts von dir rascheln, je näher du dem Tor kommst. Ein Silbernes Tor, welches von Mosbedeckten Mauern rechts und links umgeben ist, versperrt dir den Weg.");
        choice1.setText("Ich sehe mich um.");
        choice2.setText("Ich versuche die Mauern hoch zu klettern");
        choice3.setText("Torschloss anschauen");
        choice4.setText("Weggehen");
    }
    
    public void torSchlüssel(){
        position = "torSchlüssel";
        mainTextArea.setText("Das Tor hat ein rostiges Schloss. Vielleicht kannst du es aufbrechen oder hast einen Schlüssel der passen könnte.");
        choice1.setText("Versuchen aufzubrechen");
        choice2.setText("Weggehen");
        choice3.setText("");
        choice4.setText("");
    }
    
    public void torAufbrechen(){
        position = "torAufbrechen";
        mainTextArea.setText("Du schlägst gegen das Tor, aber nichts geschieht.");
        choice1.setText("Weggehen");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
    }
    
    public void friedhofInnen(){
        position = "friedhofInnen";
        mainTextArea.setText("Du schlägst mit deiner Waffe gegen das Schloss des Tores, aber nichts passiert.\n Im nächsten Moment fällt dir ein, dass der Schmied dir einen Schlüssel mitgegeben hat.\n Der Schlüssel passt und öffnet das Schloss. Du betrittst den Friedhof.");
        choice1.setText("Hinein gehen.");
        choice2.setText("Weggehen.");
        choice3.setText("");
        choice4.setText("");
        
        
    }
    
    public void ichSeheMichUmFriedhof(){
        position = "ichSeheMichUmFriedhof";
        mainTextArea.setText("Trotz Tageslicht siehst du nichts von Interesse.");
        choice1.setText(">");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
    }
    
    public void friedhofsTor(){
        position = "friedhofsTor";
        mainTextArea.setText("Du stehst vor dem Tor.");
        choice1.setText("Versuche die Mauern hochzuklettern.");
        choice2.setText("Weggehen.");
        choice3.setText("");
        choice4.setText("");
    }
    
    public void friedhofMauerKlettern(){
        position = "friedhofMauerKlettern";
        mainTextArea.setText("Du schaffst es etwas hochzuklettern, aber rutscht von der Mos bedeckten Mauer ab und fliegst hinunter.\n\n (Du erhältst 1 Schaden) ");
        playerHP = playerHP - 1;
        hpLabelNumber.setText(""+playerHP);
        choice1.setText("Weggehen");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
    }
    
    public void grabstätten(){
        position = "grabstätten";
        mainTextArea.setText("Du gehst über den Friedhof und kommst an die Grabstätte an. Du begibst dich direkt auf die Suche und nach kurzer Zeit, findest du den Teddybären des Mädchens. \n\nAls du den Teddybären aufheben wolltest, hebt er ab und beginnt in der Luft zu schweben.\nVor entsetzen machst du einen großen Sprung nach hinten.\n Eine schmerzerfüllte Stimme ertönt: \n\nDU NIMMST IHN MIR NICHT WEG!");
        choice1.setText("Reden");
        choice2.setText("Kämpfen");
        choice3.setText("Wegrennen");
        choice4.setText("");
    }
    
    public void händlerHaus(){
        position = "händlerHaus";
        mainTextArea.setText("Du betrittst das Händlerhaus.\n\n Du befindest dich in einem großen Raum, welcher mit den verschiedenste Dingen vollgepackt ist. Wäre dein Goldsack nicht so leer, hättest du hier sicher etwas gefunden.\n\nEin großer schlanker Mann komm hinter eine Stapel Kisten hervor.\nHändler: Seid gegrüßt fremder.\nHändler: Mein Name ist Egon, wie kann ich Euch helfen?");
        choice1.setText("Ich sehe mich nur um.");
        choice2.setText("Ich suche einen Job");
        choice3.setText("Weggehen");
        choice4.setText("");
    }
    
    public void goblinKopfAbgeben(){
        position = "goblinKopfAbgeben";
        mainTextArea.setText("Vielen Dank für Ihre Tapferkeit.");
        armor = "Brustpanzer";
        armorLabelName.setText(armor);
        playerHP = playerHP + 15;
        hpLabelNumber.setText(""+playerHP);
        choice1.setText("Weggehen");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
    }
    
    
    
    public void crossRoad(){
        position = "crossRoad";
        mainTextArea.setText("Du bist an der Kreuzung.Wenn du nach Süden gehst, wirst du zurück zum Dorf gehen.");
        
        choice1.setText("Gehe nach Norden");
        choice2.setText("Gehe nach Osten");
        choice3.setText("Gehe nach Süden");
        choice4.setText("Gehe nach Westen");
    }
    
    
    
    public void ostStraße(){
        position = "ostStraße";
        mainTextArea.setText("Du befindest dich auf der östlichen Straße.\n In 6 Tagesmärschen käme das Dorf Kieselstein.");
        choice1.setText("Weitergehen");
        choice2.setText("Zurückgehen");
        choice3.setText("");
        choice4.setText("");
    }
    
    
    public void ostStraße1(){
        position = "ostStraße1";
        mainTextArea.setText("Du gehst die Straße entlang. Bäume zieren den Wegesrand.");
        choice1.setText("Weitergehen");
        choice2.setText("Zurückgehen");
        choice3.setText("");
        choice4.setText("");
        
    }
    
    public void ostStraße2(){
        position = "ostStraße2";
        mainTextArea.setText("Niemand kommt dir entgegen.\n Eigendlich ist diese Straße eine gut besuchte Route. ");
        choice1.setText("Weitergehen");
        choice2.setText("Zurückgehen");
        choice3.setText("");
        choice4.setText("");
    }
    
    public void ostStraße3(){
        position = "ostStraße3";
        mainTextArea.setText("Aus weiter Entfernung siehst du schon, dass es wohl einen Kampf gegeben haben muss.");
        choice1.setText("Weitergehen");
        choice2.setText("Zurückgehen");
        choice3.setText("");
        choice4.setText("");
    }
    
    public void kampfSpuren(){
        position = "kampfSpuren";
        mainTextArea.setText("Als du dich näherst, siehst du einen Wagen am Wegesrand und zwei Pferde die auf dem Boden liegen. Sie haben wohl den Wagen gezogen. \nDie Pferde weisen deutliche Kampfspuren auf.\n Jemand hat ihnen Pfeile in den Kopf geschossen. Was dir auffällt ist, dass keine menschlichen Leichen zu sehen sind. Es sind aber deutliche schleifspuren in der matschigen Erde zu sehen. Die Spuren führen weiter in den Wald hinein.  ");
        choice1.setText("In den Wald hineingehen");
        choice2.setText("etwas abseits in den Wald schleichen");
        choice3.setText("Weggehen");
        choice4.setText("");
    }
    
    public void inDenWaldGehen(){
        position = "inDenWaldGehen";
        mainTextArea.setText("Du läufst durch den Wald und folgst den Spuren. Du wurdest anscheinend bemerkt, ");
        choice1.setText("Kämpfen");
        choice2.setText("Wegrennen");
        choice3.setText("");
        choice4.setText("");
    }
    
    public void inDenWaldSchleichen(){
        position = "inDenWaldSchleichen";
        mainTextArea.setText("Du schleichst durch den Wald. Du behältst die Spuren im Blick und nach einigr Zeit bemerkst du ein Lagerfeuer. Drum herum sitzen zwei zwei Gestalten.");
        initiative=1;
        choice1.setText("Angreifen");
        choice2.setText("Wegschleichen");
        choice3.setText("");
        choice4.setText("");
    }
    
    
    
    public void dorfFirst(){
        position = "dorfFirst";
        mainTextArea.setText("Du befindest dich auf dem Dorfplatz. \nEs herrscht ein reges treiben im Dorf. \nViele verschiedene Menschen laufen umher und erledigen ihre täglichen Tätigkeiten.");
        choice1.setText("Gehe zur Schmiede");
        choice2.setText("Gehe zur Taverne");
        choice3.setText("Gehe zum Friedhof");
        choice4.setText("Gehe zum Händlerhaus");
        
    }
    
    public void dorfPlatz(){
        position = "dorfPlatz";
        mainTextArea.setText("Du bist wieder auf dem Dorfplatz.");
        choice1.setText("Gehe zur Schmiede");
        choice2.setText("Gehe zur Taverne");
        choice3.setText("Gehe zum Friedhof");
        choice4.setText("Gehe zum Händlerhaus");
    }
    
    //////////////////////Personen//////////////////////////////
    
    public void mitGeistReden(){
        position = "mitGeistReden";
        mainTextArea.setText("Es erscheint eine bläulich, schimmernde Gestalt. \nGeist: Er gehört mir! Ich habe ihn jemanden geschenkt!\n  ");
        choice1.setText("Er gehört einem kleinen Mädchen");
        choice2.setText("Ich nehme ihn mir jetzt!");
        choice3.setText("Wegrennen");
        choice4.setText("");
    }
    
    public void mitGeistReden2(){
        position = "mitGeistReden2";
        mainTextArea.setText("Einem Mädchen? meine Gedanken sind verzerrt. Sie verschwinden immer mehr. Ich kannte mal ein kleines Mädchen, doch leider wurde sie mir entrissen! Dieser Schmmerz.");
        choice1.setText("Ich kenne dieses Mädchen");
        choice2.setText("Wegrennen");
        choice3.setText("");
        choice4.setText("");
    }
    
    public void mitGeistReden3(){
        position = "mitGeistReden3";
        mainTextArea.setText("Ihr kennt es? meine... meine... meine Tochter?\nKönntet ihr, ihr Teddybär wiederbringen?. Ich wäre Euch sehr dankbar.");
        choice1.setText("Gerne.");
        choice2.setText("Weggehen.");
        choice3.setText("");
        choice4.setText("");
    }
    
    public void geistVerschwindet(){
        position = "geistVerschwindet";
        mainTextArea.setText("Der Geist verschwindet und der Teddybär gleitet dir entgegen. Du nimmst ihn an dich.");
        teddybär = 1;
        choice1.setText("Weggehen");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
        
    }
    
    public void schmied(){
        position = "schmied";
       mainTextArea.setText("Schmied: mhhh, eigendlich nicht.\n Der Schmied schien auf einmal nachdenklich zu sein.\nWobei... Ihr könntet mir helfen den Teddybär meiner Tochter zu suchen.\n Zuletzt hatte sie ihn gehabt, als wir am Grab ihrer Mutter waren.\n Vielleicht hat sie ihn dort verloren. \n Könntet ihr ihn für mich suchen? so kann ich meine Arbeit für den König fortsetzen.");
        choice1.setText("Ich helfe ihnen gerne.");
        choice2.setText("Nein, ich habe leider keine Zeit.");
        choice3.setText("");
        choice4.setText("");
    
    }
    
    public void teddyAbgeben(){
        position = "teddyAbgeben";
        mainTextArea.setText("Schmied: Wunderbar, du hast den Teddybär meiner Tochter! Tausend Dank!\nHier nimm dies\n(Langschwert erhalten.)");
        weapon = "Langschwert";
        weaponLabelName.setText(weapon);
        choice1.setText("Weggehen.");
        choice2.setText("Kreuzung");
        choice3.setText("");
        choice4.setText("");
    }
    
    public void talkGuard(){
        position = "talkGuard";
        mainTextArea.setText("Wache: Hallo Fremder. Dein Gesicht habe ich hier noch nie gesehen. Was führt dich her?");
        choice1.setText("Ich bin auf der Durchreise.");
        choice2.setText("Ich bin ein Händler und Geschäftlich hier.");
        choice3.setText("Ich suche jemanden.");
        choice4.setText("Geht Euch nichts an.");
    }
    
    public void gehtEuchGarnichtsAn(){
        position = "gehtEuchGarnichtsAn";
        mainTextArea.setText("Wache: Wie unhöflich. Verschwindet!");
        choice1.setText("Weggehen.");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
    }
    
    public void antwortWacheDurchreise(){
        position = "antwortWache";
        mainTextArea.setText("Ah, sehr interessant.\n Ich empfehle Euch die Taverne zu besuchen. Dort gibt es die neusten Gerüchte.");
        choice1.setText("In das Dorf gehen.");
        choice2.setText("Zur Kreuzung.");
        choice3.setText("");
        choice4.setText("");
        
    }
    
    public void antwortWacheHändler(){
        position = "antwortWache";
        mainTextArea.setText("Ah, sehr interessant.\n Ich empfehle Euch Egon zu besuchen. Er ist im Handelshaus und allerlei Kram zu verkaufen.");
        choice1.setText("In das Dorf gehen.");
        choice2.setText("Zur Kreuzung.");
        choice3.setText("");
        choice4.setText("");
        
    }
    
    public void antwortWacheJemandenSuchen(){
        position = "antwortWache";
        mainTextArea.setText("Ah, sehr interessant.\n Ich empfehle Euch Thorek den Schmied aufzusuchen. Er kennt viele Leute.");
        choice1.setText("In das Dorf gehen.");
        choice2.setText("Zur Kreuzung.");
        choice3.setText("");
        choice4.setText("");
        
    }
    
    
    
    public void attackGuard(){
        position = "attackGuard";
        mainTextArea.setText("Wache: Hey, mach keinen unsinn!\n\nDie Wache schlägt zurück und hat dich hart im Gesicht getroffen.\n(Du bekommst 3 Schadenspunkte)");
        playerHP = playerHP - 3;
        hpLabelNumber.setText(""+playerHP);
        choice1.setText("Weggehen.");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
    }
    
    public void schmiedHelfen(){
        position = "schmiedHelfen";
        mainTextArea.setText("Schmied: Vielen Dank.\n Nehmt diesen Schlüssel, damit bekommt ihr das Tor zum Friedhof auf.\n\n (Du hast einen Schlüssel bekommen)");
        
        silverKey = 1;
        
        choice1.setText("Zurück zum Dorfplatz.");
        choice2.setText("Aus dem Dorf gehen.");
        choice3.setText("");
        choice4.setText("");
    }
    
    public void egonAnsprechen(){
        position="egonAnsprechen";
        mainTextArea.setText("Egon: Wie kann ich Ihnen helfen?");
        choice1.setText("Ich suche einen Job");
        choice2.setText("Weggehen");
        choice3.setText("");
        choice4.setText("");
    }
    
    public void egonAufgabe(){
        position = "egonAufgabe";
        mainTextArea.setText("Egon: mhhh... tatsächlich hätte ich da etwas, was erledigt werden müsste. \nEgon: Seit längerem werden meine Kutschen von Goblins angegriffen. \n Egon: Wärt ihr stark genug, um diese Goblins zu erledigen?");
        choice1.setText("Es ist schnell erledigt.");
        choice2.setText("Ich bin mir unsicher.");
        choice3.setText("");
        choice4.setText("");
    }
    
    public void ichSeheMichNurUm(){
        position = "ichSeheMichNurUm";
        mainTextArea.setText("Viele verschiedene Waren findest du interessant.\n Aber du hast leider nicht genug Gold dafür.");
        choice1.setText("Egon ansprechen.");
        choice2.setText("weggehen");
        choice3.setText("");
        choice4.setText("");
    }
    
    public void esIstSchnellErledigt(){
        position = "esIstSchnellErledigt";
        mainTextArea.setText("Egon: Vielen Dank!. Bringt mir zum beweiß einen Kopf eines Goblins. \n Die Goblins befinden sich Östlich von der Kreuzung.\n Die Meiste Zeit hausen sie in der Nähe der Straße.");
        choice1.setText("Zum Dorfplatz.");
        choice2.setText("Zur Kreuzung");
        choice3.setText("");
        choice4.setText("");
        
    }
    
    public void holzFällerBart(){
        position = "holzFällerBart";
        mainTextArea.setText("Super, du hast das Holz geholt.");
        choice1.setText("");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
    }
    
    public void vermummter(){
        position = "vermummter";
        mainTextArea.setText("Der vermummte großstämmige Mann dreht sich zu euch um.\n Vermummter Mann: Grüße euch. Ich heiße Erald. Wie ich sehe, haben wir die gleiche Aufgabe vom Händler in Kaltwacht bekommen. \n Auf dann.\n Er dreht sich um und geht weitr in den Wald hinein.");
        choice1.setText("Weggehen");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
    }
    
    public void death(){
        position = "death";
        mainTextArea.setText("Du bist gestorben!\n\n<GAME OVER>");
    
    choice1.setText("");
    choice2.setText("");
    choice3.setText("");
    choice4.setText("");
    choice1.setVisible(false);
    choice2.setVisible(false);
    choice3.setVisible(false);
    choice4.setVisible(false);
        
    }
    
    
    public void winWald(){
        position = "win";
        mainTextArea.setText("Du hast das Monster besiegt!\n\n\n Erschöpft vom Kampf, gehst du weiter auf die Suche nach Holz. Du findest genug Holz um heimzukehren.");
        holz = 1;
        choice1.setText("Zurück zum Holzfällerhaus");
        choice2.setText("Kreuzung");
        choice3.setText("");
        choice4.setText("");
        
    }
    
    public void winGeist(){
        position = "winGeist";
        mainTextArea.setText("Du hast das Monster besiegt!\n\n\n Ein lautes schreien ertönt und erlischt von einer auf der anderen Sekunde. Der Teddybär fällt zu Boden und du hebst ihn auf.");
        teddybär = 1;
        choice1.setText("Zurück zum dorf");
        choice2.setText("Kreuzung");
        choice3.setText("");
        choice4.setText("");
    }
    
    public void winWaldGoblins(){
        position = "winWaldGoblins";
        mainTextArea.setText("Während du dem Goblin gerade den Kopf abschlägst, bemerkst du wie sich jemand um den anderen gekümmert hat.");
        goblinKopf = 1;
        choice1.setText("Mit dem vermummten reden");
        choice2.setText("Weggehen");
        choice3.setText("");
        choice4.setText("");
    }
    
    public void winEbenholz(){
        position = "winEbenholz";
        mainTextArea.setText("Du zerteilst den Ork von der Hüfte an abwärts. Er sinkt zu Boden.\n Dir fällt ein Ring auf, der das Licht einfängt, zurückwirft und dich blendet. Es muss der Ehering des Geistes sein. Du hebst ihn auf.");
        eheRing = 1;
        monsterHP = 15;
        choice1.setText("Weggehen");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
    }
    
    
    public void kampf(){
        position = "kampf";
        mainTextArea.setText("Monster HP: " + monsterHP + "\n\nWas tust du?");
        choice1.setText("Angreifen");
        choice2.setText("Wegrennen");
        choice3.setText("");
        choice4.setText("");
    }
    
    public void kampf1(){
        position = "kampf1";
        mainTextArea.setText("Monster HP: " + monsterHP + "\n\nWas tust du?");
        choice1.setText("Angreifen");
        choice2.setText("Wegrennen");
        choice3.setText("");
        choice4.setText("");
    }
    
    public void kampf2(){
        position = "kampf2";
        mainTextArea.setText("Monster HP: " + monsterHP + "\n\nWas tust du?");
        choice1.setText("Angreifen");
        choice2.setText("Wegrennen");
        choice3.setText("");
        choice4.setText("");
    }
    
    public void kampf3(){
        position = "kampf3";
        mainTextArea.setText("Monster HP: " + monsterHP + "\n\nWas tust du?");
        
        choice1.setText("Angreifen");
        choice2.setText("Wegrennen");
        choice3.setText("");
        choice4.setText("");
    }
    
    
    
    public void kampfÜberraschung(){
        position = "kampfÜberraschung";
        mainTextArea.setText("Monster HP: " + monsterHP + "\n\nWas tust du?");
        choice1.setText("Angreifen");
        choice2.setText("Wegrennen");
        choice3.setText("");
        choice4.setText("");
    }
    
    
    public void richtungEbenholz(){
        position = "richtungEbenholz";
        mainTextArea.setText("Du gehst die Straße weiter nach Westen. Trotz der Wucherung kannst du den Weg zum Hof Ebenholz folgen.\n Nach einiger Zeit siehst du ein verlassenes Haus, welche vor einiger Zeit eingestürzt sein muss.\n Als du es eine Zeitlang beobachtest, siehst du wie sich die Tür öffnet und ein großer Ork heraus tritt. Er muss dich bemerkt haben, denn er stürmt direkt auf dich zu.");
        monsterHP = monsterHP + 20;
        choice1.setText("Kämpfen");
        choice2.setText("Rennen");
        choice3.setText("");
        choice4.setText("");
    }
    
    
    
    
    
    public void playerAttack(){
    position = "playerAttack";
    int playerDamage = 0;
    
    if(weapon.equals("Messer")){
        playerDamage= new java.util.Random().nextInt(3);
    }
    else if(weapon.equals("Langschwert")){
        playerDamage= new java.util.Random().nextInt(8);
    }
    
    
    
    mainTextArea.setText("Du greifst das Monster an und gibst ihn " + playerDamage + " Schaden!");
    
    monsterHP = monsterHP - playerDamage;
    
        choice1.setText(">");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
}
    
    
    public void playerAttack1(){
    position = "playerAttack1";
    int playerDamage = 0;
    
    if(weapon.equals("Messer")){
        playerDamage= new java.util.Random().nextInt(3);
    }
    else if(weapon.equals("Langschwert")){
        playerDamage= new java.util.Random().nextInt(8);
    }
    
    mainTextArea.setText("Du greifst das Monster an und gibst ihn " + playerDamage + " Schaden!");
    
    monsterHP = monsterHP - playerDamage;
    
        choice1.setText(">");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
    
    }
    
    public void playerAttack2(){
    position = "playerAttack2";
    int playerDamage = 0;
    
    if(weapon.equals("Messer")){
        playerDamage= new java.util.Random().nextInt(3);
    }
    else if(weapon.equals("Langschwert")){
        playerDamage= new java.util.Random().nextInt(8);
    }
    
    mainTextArea.setText("Du greifst das Monster an und gibst ihn " + playerDamage + " Schaden!");
    
    monsterHP = monsterHP - playerDamage;
    
        choice1.setText(">");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
    
    }
    
    public void playerAttack3(){
    position = "playerAttack3";
    int playerDamage = 0;
    
    if(weapon.equals("Messer")){
        playerDamage= new java.util.Random().nextInt(3);
    }
    else if(weapon.equals("Langschwert")){
        playerDamage= new java.util.Random().nextInt(8);
    }
    
    mainTextArea.setText("Du greifst das Monster an und gibst ihn " + playerDamage + " Schaden!");
    
    monsterHP = monsterHP - playerDamage;
    
        choice1.setText(">");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
    
    }
    
    
    
    
    public void playerAttackÜberraschung(){
    position = "playerAttackÜberraschung";
    int playerDamage = 0;
    
    if(weapon.equals("Messer")){
        playerDamage= new java.util.Random().nextInt(3);
    }
    else if(weapon.equals("Langschwert")){
        playerDamage= new java.util.Random().nextInt(8);
    }
    
    mainTextArea.setText("Du greifst das Monster an und gibst ihn " + playerDamage + " Schaden!");
    
    
    
    monsterHP = monsterHP - playerDamage;
    
        choice1.setText(">");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
    
    }
    
    
    
    public void monsterAttack(){
        position = "monsterAttack";
        
        int monsterDamage = 0;
        
        monsterDamage= new java.util.Random().nextInt(5);
        
        mainTextArea.setText("Das Monster greift dich an und gibt dir " + monsterDamage + " Schaden!");
        
        
        playerHP = playerHP - monsterDamage;
        hpLabelNumber.setText(""+playerHP);
        
        
        choice1.setText(">");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
    }
    
    public void monsterAttack1(){
        position = "monsterAttack1";
        
        int monsterDamage = 0;
        
        monsterDamage= new java.util.Random().nextInt(4);
        
        mainTextArea.setText("Das Monster greift dich an und gibt dir " + monsterDamage + " Schaden!");
        
        playerHP = playerHP - monsterDamage;
        hpLabelNumber.setText(""+playerHP);
        
        
        choice1.setText(">");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
    }
    
    public void monsterAttack2(){
        position = "monsterAttack2";
        
        int monsterDamage = 0;
        
        monsterDamage= new java.util.Random().nextInt(5);
        
        mainTextArea.setText("Das Monster greift dich an und gibt dir " + monsterDamage + " Schaden!");
        
        playerHP = playerHP - monsterDamage;
        hpLabelNumber.setText(""+playerHP);
        
        
        choice1.setText(">");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
    }
    
    public void monsterAttack3(){
        position = "monsterAttack3";
        
        int monsterDamage = 0;
        
        
        monsterDamage= new java.util.Random().nextInt(5);
        
        mainTextArea.setText("Das Monster greift dich an und gibt dir " + monsterDamage + " Schaden!");
        
        playerHP = playerHP - monsterDamage;
        hpLabelNumber.setText(""+playerHP);
        
        
        choice1.setText(">");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
    }
    
    
    
    
    
    public void monsterAttackÜberraschung(){
        position = "monsterAttackÜberraschung";
        
        int monsterDamage = 0;
        
        monsterDamage= new java.util.Random().nextInt(5);
        
        mainTextArea.setText("Das Monster greift dich an und gibt dir " + monsterDamage + " Schaden!");
        
        playerHP = playerHP - monsterDamage;
        hpLabelNumber.setText(""+playerHP);
        
        
        choice1.setText(">");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
    }
    
    
    public void fliehen(){
        position = "fliehen";
        mainTextArea.setText("Du entkommst.");
        choice1.setText(">");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
    }
    
    
    public void spielEnde(){
        position = "spielEnde";
        mainTextArea.setText("Du... Du hast es geschafft. Ich danke dir aus tiefstem Herzen! \n\n DU BIST EIN WAHRER HELD!\n\n\n\n\n\n\n ENDE");
    choice1.setText("");
    choice2.setText("");
    choice3.setText("");
    choice4.setText("");
    choice1.setVisible(false);
    choice2.setVisible(false);
    choice3.setVisible(false);
    choice4.setVisible(false);
    }
    
    
    
    
    
    public class TitleScreenHandler implements ActionListener{
        
        public void actionPerformed(ActionEvent event){
            
            createGameScreen();
            
        }
    }
    
    
    
    
    
    
    
    public class ChoiceHandler implements ActionListener{
        
        public void actionPerformed(ActionEvent event){
            
            String yourChoice = event.getActionCommand();
            
            switch(position){
                case "townGate":
                    switch(yourChoice){
                case "c1": talkGuard();break;
                case "c2": attackGuard();break;
                case "c3": crossRoad();break;
                    }
                break;
                
                case "townGateFirst":
                    switch(yourChoice){
                case "c1": talkGuard();break;
                case "c2": attackGuard();break;
                case "c3": crossRoad();break;
                    }
                    break;
                
                case "talkGuard":
                    switch(yourChoice){
                        case "c1": antwortWacheDurchreise(); break;
                        case "c2": antwortWacheHändler(); break;
                        case "c3": antwortWacheJemandenSuchen(); break;
                        case "c4": gehtEuchGarnichtsAn(); break;
                    }
                    break;
                    
                case "gehtEuchGarnichtsAn":
                    switch(yourChoice){
                        case "c1": crossRoad(); break;
                       
                    }
                    break;
                    
                case "antwortWache":
                    switch(yourChoice){
                        case "c1": dorfFirst(); break;
                        case "c2": crossRoad(); break;
                    }
                    break;
                    
                case "dorfFirst":
                    switch(yourChoice){
                        case "c1": schmiede(); break;
                        case "c2": taverne(); break;
                        case "c3": friedhof(); break;
                        case "c4": händlerHaus(); break;
                    }
                    break;
                    
                case "dorfPlatz":
                    switch(yourChoice){
                        case "c1": schmiede(); break;
                        case "c2": taverne(); break;
                        case "c3": friedhof(); break;
                        case "c4": händlerHaus(); break;
                    }
                    break;
                    
                case "attackGuard":
                    switch(yourChoice){
                case "c1": townGateFirst(); break;
                }
                break;
                
               
            case "crossRoad":
                switch(yourChoice){
                case "c1": north(); break;
                case "c2": ostStraße();break;
                case "c3": townGateFirst(); break;
                case "c4": west();break;
                }
                break;
                
            case "schmiede":
                switch(yourChoice){
                    case "c1":  dorfPlatz(); break;
                    case "c2":  dorfPlatz(); break;
                    case "c3":
                        if(teddybär==1){
                            teddyAbgeben(); break;
                        }
                        else {
                            schmied(); break; 
                        }
                        
                    case "c4":  dorfPlatz(); break;
                }
                break;
                
            case "schmied":
                switch(yourChoice){
                    case "c1": schmiedHelfen(); break;
                    case "c2": dorfPlatz(); break;
                }
                break;
                
            case "schmiedHelfen":
                switch(yourChoice){
                    case "c1": dorfPlatz(); break;
                    case "c2": crossRoad(); break;
                }
                break;
                
            case "händlerHaus":
                switch(yourChoice){
                    case "c1": ichSeheMichNurUm(); break;
                    case "c2": 
                        if(goblinKopf==1){
                            goblinKopfAbgeben();
                        }
                        else {
                        egonAufgabe();
                        }
                        break;
                    case "c3": dorfPlatz();break;
                }
                break;
                
            case "ichSeheMichNurUm":
                switch(yourChoice){
                    case "c1": egonAnsprechen(); break;
                    case "c2": dorfPlatz(); break;
                }
                 break;
                 
            case "egonAnsprechen":
                switch(yourChoice){
                    case "c1": egonAufgabe(); break;
                    case "c2": dorfPlatz(); break;
                }
              break;
                
            case "egonAufgabe":
                switch(yourChoice){
                    case "c1": esIstSchnellErledigt(); break;
                    case "c2": dorfPlatz(); break;
                }
                break;
                
            case "esIstSchnellErledigt":
                switch(yourChoice){
                    case "c1": dorfPlatz(); break;
                    case "c2": crossRoad(); break;
                }
                break;
                
            case "friedhof":
                switch(yourChoice){
                    case "c1": ichSeheMichUmFriedhof(); break;
                    case "c2": friedhofMauerKlettern(); break;
                    case "c3": torSchlüssel(); break;
                    case "c4": crossRoad(); break;
                }
                break;
                
            case "ichSeheMichUmFriedhof":
                switch(yourChoice){
                    case "c1": friedhofsTor(); break;
                    case "c2": crossRoad(); break;   
                }
                break;
                
            case "friedhofMauerKlettern":
                switch(yourChoice){
                    case "c1": friedhofsTor(); break;
                    case "c2": dorfPlatz(); break;    
                }
                break;
                
            case "friedhofsTor":
                switch(yourChoice){
                    case "c1": friedhofMauerKlettern(); break;
                    case "c2": crossRoad(); break;
                }
                break;
                
            case "torSchlüssel":
                switch(yourChoice){
                    case "c1": 
                        if(silverKey==1){
                            friedhofInnen();
                        }
                        else{
                            torAufbrechen();
                        }
                        break;
                    case "c2": dorfPlatz(); break;
                }
                break;
                
            case "north":
                switch(yourChoice){
                    case "c1": holzFällerHütte(); break;
                    case "c2": crossRoad(); break;
                   
                }
                break; 
           
            case "holzFällerHütte":
                switch(yourChoice){
                    case "c1":
                        if(holz==1){
                            holzFällerBart();
                        }
                        else{
                            holzFällerHütteAnnähern();
                        }
                        break;
                    case "c2": holzFällerHütteBeobachten(); break;
                    case "c3": crossRoad(); break;
                }
                break;
                
            case "holzFällerHütteAnnähern":
                switch(yourChoice){
                    case "c1": holzFällerBaumFällen(); break;
                    case "c2": holzFällerEssen2(); break;
                    case "c3": crossRoad(); break;
                }
                break;
                
            case "holzFällerBaumFällen":
                switch(yourChoice){
                    case "c1": holzFällerBäumeFällen(); break;
                    case "c2": neinDanke(); break;
                }
                break;
                
                
            case "holzFällerHütteBeobachten":
                switch(yourChoice){
                    case "c1": holzFällerMannAnnähern(); break; 
                    case "c2": holzFällerMannBedrohen(); break;
                    case "c3": crossRoad(); break;
                }
                break;
                
            case "holzFällerMannAnnähern":
                switch(yourChoice){
                    case "c1": holzFällerEssen2(); break;
                    case "c2": crossRoad(); break;
                }
                break;
                
            case "holzFällerEssen2":
                switch(yourChoice){
                    case "c1": essenUndAusruhen(); break;
                    case "c2": crossRoad(); break;
                }
                break;
                
            case "essenUndAusruhen":
                switch(yourChoice){
                    case "c1": crossRoad(); break;
                   
                }
                break;
                
            case "holzFällerBäumeFällen":
                switch(yourChoice){
                    case "c1": kampf(); break;
                    case "c2": crossRoad(); break;
                }
                break;
                
            case "neinDanke":
                switch(yourChoice){
                    case "c1": crossRoad(); break;
                }
                break;
                
            case "kampf":
                switch(yourChoice){
                    case "c1": playerAttack(); break;
                    case "c2": fliehen(); break;
                }
                break;
                
                case "kampf1":
                switch(yourChoice){
                    case "c1": playerAttack1(); break;
                    case "c2": fliehen(); break;
                }
                break;
                
                
                case "kampf2":
                switch(yourChoice){
                    case "c1": playerAttack2(); break;
                    case "c2": fliehen(); break;
                }
                break;
                
                case "kampf3":
                switch(yourChoice){
                    case "c1": playerAttack3(); break;
                    case "c2": fliehen(); break;
                }
                break;
                
                
                case "kampfÜberraschung":
                switch(yourChoice){
                    case "c1": playerAttackÜberraschung(); break;
                    case "c2": fliehen(); break;
                }
                break;
                
                /////Holzfällerkampf
            case "playerAttack":
                switch(yourChoice){
                    case "c1":
                        if(monsterHP<1){
                            winWald();
                        }
                        else{
                            monsterAttack();
                        }
                        break;
                }
                break;
                
                
                /////////Friedhof Geist Kampf
                
                case "playerAttack1":
                switch(yourChoice){
                    case "c1":
                        if(monsterHP<1){
                            winGeist();
                        }
                        else{
                            monsterAttack1();
                        }
                        break;
                }
                break;
                
                ///// Wald Goblins Kampf
                
                case "playerAttack2":
                switch(yourChoice){
                    case "c1":
                        if(monsterHP<1){
                            winWaldGoblins();
                        }
                        else{
                            monsterAttack2();
                        }
                        break;
                }
                break;
                
                ////// Ork Kampf
                
                case "playerAttack3":
                switch(yourChoice){
                    case "c1":
                        if(monsterHP<1){
                            winEbenholz();
                        }
                        else{
                            monsterAttack3();
                        }
                        break;
                }
                break;
                
                case "playerAttackÜberraschung":
                switch(yourChoice){
                    case "c1":
                        if(monsterHP<1){
                            winWaldGoblins();
                        }
                        else{
                            monsterAttackÜberraschung();
                        }
                        break;
                }
                break;
                
                
                
                case "monsterAttack":
                switch(yourChoice){
                    case "c1":
                        if(playerHP<1){
                            death();
                        }
                        else{
                            kampf();
                        }
                        break;
                }
                
            case "monsterAttack1":
                switch(yourChoice){
                    case "c1":
                        if(playerHP<1){
                            death();
                        }
                        else{
                            kampf1();
                        }
                        break;
                }
                
                case "monsterAttack2":
                switch(yourChoice){
                    case "c1":
                        if(playerHP<1){
                            death();
                        }
                        else{
                            kampf2();
                        }
                        break;
                }
                break;
                
                case "monsterAttack3":
                switch(yourChoice){
                    case "c1":
                        if(playerHP<1){
                            death();
                        }
                        else{
                            kampf3();
                        }
                        break;
                }
                break;
                
                
                
                case "monsterAttackÜberraschung":
                switch(yourChoice){
                    case "c1":
                        if(playerHP<1){
                            death();
                        }
                        else{
                            kampf2();
                        }
                        break;
                }
                break;
                
                
            case "friedhofInnen":
                switch(yourChoice){
                    case "c1": grabstätten(); break;
                    case "c2": crossRoad(); break;
                }
                break;
                
            case "grabstätten":
                switch(yourChoice){
                    case "c1": mitGeistReden(); break;
                    case "c2": kampf1(); break;
                    case "c3": fliehen(); break;
                }
                break;
                
            case "mitGeistReden":
                switch(yourChoice){
                    case "c1": mitGeistReden2(); break;
                    case "c2": kampf1(); break;
                    case "c3": crossRoad(); break;
                }
                break;
                
                
            case "mitGeistReden2":
                switch(yourChoice){
                    case "c1": mitGeistReden3(); break;
                    case "c2": kampf1(); break;
                    case "c3": crossRoad(); break;
                }
                break;
                
            case "mitGeistReden3":
                switch(yourChoice){
                    case "c1": geistVerschwindet(); break;
                    case "c2": crossRoad();break;
                }
                break;
                
            case "winGeist":
                switch(yourChoice){
                    case "c1": dorfPlatz(); break;
                    case "c2": crossRoad(); break;
                }
                break;
                
            case "torAufbrechen":
                switch(yourChoice){
                    case "c1": dorfPlatz(); break;
                }
                break;
                
            case "fliehen":
                switch(yourChoice){
                    case "c1": dorfPlatz(); break;
                    
                }
                break;
                
                
                
            case "geistVerschwindet":
                switch(yourChoice){
                    case "c1": dorfPlatz(); break;
                }
                break;
                
                
            case "teddyAbgeben":
                switch(yourChoice){
                    case "c1": dorfPlatz(); break;
                    case "c2": crossRoad(); break;
                }
                break;
                
            case "ostStraße":
                switch(yourChoice){
                    case "c1": ostStraße1(); break;
                    case "c2": crossRoad(); break;  
                }
                break;
                
                
                
            case "ostStraße1":
                switch(yourChoice){
                    case "c1": ostStraße2(); break;
                    case "c2": crossRoad(); break;
                }
                break;
                
                case "ostStraße2":
                switch(yourChoice){
                    case "c1": ostStraße3(); break;
                    case "c2": crossRoad(); break;
                }
                break;
                
                case "ostStraße3":
                switch(yourChoice){
                    case "c1": kampfSpuren(); break;
                    case "c2": crossRoad(); break;
                }
                break;
                
                case "kampfSpuren":
                    switch(yourChoice){
                        case "c1": inDenWaldGehen(); break;
                        case "c2": inDenWaldSchleichen(); break;
                        case "c3": crossRoad(); break;
                    }
                    break;
                
                case "inDenWaldGehen":
                    switch(yourChoice){
                        case "c1": kampf2(); break;
                        case "c2": crossRoad(); break;
                    }
                    break;
                
                case "inDenWaldSchleichen":
                    switch(yourChoice){
                        case "c1": kampfÜberraschung(); break;
                        case "c2": crossRoad(); break;
                    }
                    break;
                
                case "winWaldGoblins":
                    switch(yourChoice){
                        case "c1": vermummter(); break;
                        case "c2": crossRoad(); break;
                    }
                    break;
           
                case "vermummter":
                    switch(yourChoice){
                        case "c1": crossRoad(); break;
                    }
                    break;
                    
                    
                case "goblinKopfAbgeben":
                    switch(yourChoice){
                        case "c1": crossRoad(); break;
                    }
                    break;
                    
                    
                case "taverne":
                    switch(yourChoice){
                        case "c1":
                            if(eheRing==1){
                                spielEnde();
                            }
                            else{
                            taverneAusruhen();
                            }
                            break;
                        case "c2": taverneZweiTrinker(); break;
                        case "c3": taverneAlleinigerTrinker(); break;
                        case "c4": dorfPlatz(); break;
                    }
                    break;
                    
                    
                case "taverneAusruhen":
                    switch(yourChoice){
                        case "c1": zimmerTaverne(); break;
                        case "c2": zimmerTaverne(); break;
                        case "c3": zimmerTaverne(); break;
                        case "c4": zimmerTaverne(); break;
                    }
                    break;
                    
                    
                case "zimmerTaverne":
                    switch(yourChoice){
                        case "c1": ausruhen(); break;
                        case "c2": taverne(); break;
                        case "c3": dorfPlatz(); break;
                    }
                    break;
                    
                    
                case "taverneZweiTrinker":
                    switch(yourChoice){
                        case "c1": taverne(); break;
                    }
                    break;
                    
                    
                case "taverneAlleinigerTrinker":
                    switch(yourChoice){
                        case "c1": taverne(); break;
                    }
                    break;
                    
                case "ausruhen":
                    switch(yourChoice){
                        case "c1": ausruhen2(); break; 
                        case "c2": unterDieDecke(); break;
                    }
                    break;
                    
                    
                case "unterDieDecke":
                    switch(yourChoice){
                        case "c1": dorfPlatz(); break;
                    }
                    break;
                    
                case "ausruhen2":
                    switch(yourChoice){
                        case "c1": ichWerdeDirHelfenGeist(); break;
                        case "c2": unterDieDecke(); break;
                    }
                    break;
                    
                case "ichWerdeDirHelfenGeist":
                    switch(yourChoice){
                        case "c1": dorfPlatz(); break;
                    }
                    break;
                    
                case "west":
                    switch(yourChoice){
                        case "c1": richtungEbenholz(); break;
                        case "c2": crossRoad(); break;
                    }
                    break;
                    
                    
                case "richtungEbenholz":
                    switch(yourChoice){
                        case "c1": kampf3(); break;
                        case "c2": crossRoad(); break;
                    }
                    break;
                    
                case "winEbenholz":
                    switch(yourChoice){
                        case "c1": crossRoad(); break;
                    }
                    break;
                    
                    
                    
                    
            }
        }
        
    }
    
}