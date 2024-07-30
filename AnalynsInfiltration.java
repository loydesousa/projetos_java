public class AnalynsInfiltration {
    static boolean knightIsAwake = true;
    static boolean archerIsAwake = false;
    static boolean prisionerIsAwake = true;
    static boolean petDogIsPresent = true;
    public static void main(String[] args) {
        System.out.println("Podemos realizar um ataque rápido? " + AnalynsInfiltration.CanFastAttack(knightIsAwake));
        System.out.println("Podemos espionar? " + AnalynsInfiltration.CanSpy(knightIsAwake, archerIsAwake, prisionerIsAwake));
        System.out.println("Podemos mandar um sinal para o prisioneiro? " + AnalynsInfiltration.canSignalPrisoner(archerIsAwake, prisionerIsAwake));
        System.out.println("Podemos libertar o prisioneiro? " + AnalynsInfiltration.CanFreePrisioner(knightIsAwake, archerIsAwake, prisionerIsAwake, petDogIsPresent));
    }
    
    // precisamos ver se um ataque rápido pode ser feito
    static boolean CanFastAttack(boolean stateOfTheKnight) {
      return !stateOfTheKnight;
    }
    //verificar se podemos espionar
    static boolean CanSpy(boolean knight, boolean archer, boolean prisioner){
        //retorna true se ao menos um deles estiver acordado
        return knight || archer || prisioner;

       /*
       * podemos trabalhar o retorno usando a estrutura de if e else
       * if (knight && archer && prisioner) { 
                return false;
       } else if(archer && knight){
        return false;
       } else if (knight && prisioner){
        return false;
       } else if (archer && prisioner) {
        return false;
    } else if (archer){
        return true;
    }else{
        return false;
       }
       */ 
       
    }
    //verificar se o prisioneiro pode ser sinalizado
    static boolean canSignalPrisoner(boolean archerAwake, boolean prisionerAwake){
         /*  
         *nesse retorno se recebemos false e false ou true e false, ele vai retornar false
         *porque a condição do arqueiro vai ser negada e o && não vai ser satisfeito
         *ele retorna true se o arqueiro estiver dormindo, ou seja vamos estar recebendo um valor false
         *porque a condição do arqueiro vai ser negada e transformada em true o && vai ser satisfeito
         *caso o valor do prisioneiro for true 
         */
        return !archerAwake && prisionerAwake;
        /*
         * podemos trabalhar o retorno usando também a estrutura de if e else
         * if (archerAwake) {
            return false;
        } else {
            return true;
        }
         */
        

    }
    //verificar se o prisioneiro pode ser libertado
    static boolean CanFreePrisioner(boolean knightState, boolean archerState, boolean prisionerState, boolean dogPresence){
      // return (dogPresence && prisionerState) && !(knightState && archerState);
       return dogPresence && !archerState || prisionerState && !knightState && !archerState && !dogPresence;
       /* 
       * podemos trabalhar o retorno usando também a estrutura de if e else
       if (dogPresence || prisionerState) {
        return true;
       } else {
        return false;
       }
    }  
       */
}
}