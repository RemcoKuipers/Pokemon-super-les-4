import pokemon.ElectricPokemon;
import pokemon.FirePokemon;
import pokemon.GrassPokemon;
import pokemon.WaterPokemon;

public class Main {
    public static void main(String[] args) {

        FirePokemon charizard = new FirePokemon("Charizard", 55, 500, 500, "Charrizaaardd", 20, 40);
        WaterPokemon blastoise = new WaterPokemon("Blastoise", 50, 500, 500, "Blastoise!", 20, 40);
        GrassPokemon venusaur = new GrassPokemon("Venusaur", 50, 500, 500, "Venusaurrr", 20, 40);
        ElectricPokemon pikachu = new ElectricPokemon("Pikachu", 50, 500, 500, "Pika Pika chuuuuu", 20, 40);

        System.out.println("<===== The Final Pokemon Battle Begins! =====>");

        System.out.println("The stadium shakes as the four legendary Pokemon enter the arena!");

        pikachu.speaks();
        charizard.speaks();
        blastoise.speaks();
        venusaur.speaks();

        System.out.println("\nCharizard spreads his wings and attacks first!");
        charizard.flameThrower();

        System.out.println("\nBlastoise jumps in to protect Pikachu!");
        blastoise.hydroPump();

        System.out.println("\nVenusaur traps Charizard with vines from the ground!");
        venusaur.leechSeed();

        System.out.println("\nPikachu is heavily injured after the attacks.");
        System.out.println("Pikachu only has a little HP left and quickly eats a berry to recover!");

        pikachu.eat();

        System.out.println("\nThe crowd goes silent...");
        System.out.println("Dark clouds appear above the stadium as Pikachu gathers electricity!");

        pikachu.voltTackle();

        System.out.println("\nA massive explosion fills the arena!");
        System.out.println("Charizard can no longer fight!");
        System.out.println("Blastoise and Venusaur are exhausted from the battle.");

        System.out.println("\nPikachu stands up one final time and screams:");

        pikachu.speaks();

        System.out.println("\n===== Pikachu wins the battle at the very last second! =====>");


    }
}
