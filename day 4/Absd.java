abstract class Instrument {
    protected String name;
    protected boolean isTuned;
    
    public Instrument(String name) {
        this.name = name;
        this.isTuned = false;
    }
    
    
    public abstract void play();
    
   
    public abstract void tune();
    
   
    public boolean isTuned() {
        return isTuned;
    }
    
    
    public String getName() {
        return name;
    }
}


class Glockenspiel extends Instrument {
    private int numberOfBars;
    
    public Glockenspiel(int numberOfBars) {
        super("Glockenspiel");
        this.numberOfBars = numberOfBars;
    }
    
    
    public void play() {
        if (!isTuned) {
            System.out.println("The glockenspiel needs to be tuned before playing!");
            return;
        }
        System.out.println("Playing the glockenspiel with " + numberOfBars + 
                         " bars...");
        System.out.println("*Bright, metallic tones ring out in sequence*");
    }
    
  
    public void tune() {
        System.out.println("Tuning the glockenspiel...");
        System.out.println("Checking each metal bar for correct pitch...");
        System.out.println("Adjusting any misaligned bars...");
        isTuned = true;
        System.out.println("Glockenspiel is now in tune!");
    }
}


class Violin extends Instrument {
    private String stringType;
    
    public Violin(String stringType) {
        super("Violin");
        this.stringType = stringType;
    }
    
    @Override
    public void play() {
        if (!isTuned) {
            System.out.println("The violin needs to be tuned before playing!");
            return;
        }
        System.out.println("Playing the violin with " + stringType + " strings...");
        System.out.println("*Rich, resonant tones flow from the violin*");
    }
    
    @Override
    public void tune() {
        System.out.println("Tuning the violin...");
        System.out.println("Adjusting the pegs for each string (G-D-A-E)...");
        System.out.println("Fine-tuning with the fine tuners...");
        isTuned = true;
        System.out.println("Violin is now in tune!");
    }
}


class Absd {
    public static void main(String[] args) {
        
        Glockenspiel glockenspiel = new Glockenspiel(37);
        Violin violin = new Violin("synthetic core");
        
       
        System.out.println("=== " + glockenspiel.getName() + " ===");
        glockenspiel.play();  
        glockenspiel.tune();
        glockenspiel.play();  
        
        System.out.println("\n=== " + violin.getName() + " ===");
        violin.play();  
        violin.tune();
        violin.play();  
        
        System.out.println("\n=== Orchestra Practice ===");
        Instrument[] orchestra = {glockenspiel, violin};
        for (Instrument instrument : orchestra) {
            System.out.println("\nNow playing: " + instrument.getName());
            instrument.play();
        }
    }
}