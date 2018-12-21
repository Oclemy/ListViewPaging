package com.tutorials.hp.listviewpaging;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Oclemy on 2017 for ProgrammingWizards TV Channel and http://www.camposha.info.
 - Our DataHolder class.
 - Returns a static list of galaxies.
 */

public class DataHolder {
    /*
    - Return our List of galaxies.
     */
    public static List<Galaxy> getGalaxies()
    {
        ArrayList<Galaxy> galaxies=new ArrayList<>();

        Galaxy g=new Galaxy("Whirlpool",
                "The Whirlpool Galaxy, also known as Messier 51a, M51a, and NGC 5194, is an interacting grand-design spiral Galaxy with a Seyfert 2 active galactic nucleus in the constellation Canes Venatici.",
                R.drawable.whirlpool,"spiral");
        galaxies.add(g);

        g=new Galaxy("Ring Nebular",
                "The Ring Nebula is a planetary nebula in the northern constellation of Lyra. Such objects are formed when a shell of ionized gas is expelled into the surrounding interstellar medium by a red giant star.",
                R.drawable.ringnebular,"elliptical");
        galaxies.add(g);

        g=new Galaxy("IC 1011",
                "C 1011 is a compact elliptical galaxy with apparent magnitude of 14.7, and with a redshift of z=0.02564 or 0.025703, yielding a distance of 100 to 120 Megaparsecs. Its light has taken 349.5 million years to travel to Earth.",
                R.drawable.ic1011,"elliptical");
        galaxies.add(g);

        g=new Galaxy("Cartwheel",
                "The Cartwheel Galaxy is a lenticular galaxy and ring galaxy about 500 million light-years away in the constellation Sculptor. It is an estimated 150,000 light-years diameter, and a mass of about 2.9–4.8 × 10⁹ solar masses; it rotates at 217 km/s.",
                R.drawable.cartwheel,"irregular");
        galaxies.add(g);

        g=new Galaxy("Triangulumn",
                "The Triangulum Galaxy is a spiral Galaxy approximately 3 million light-years from Earth in the constellation Triangulum",
                R.drawable.triangulum,"spiral");
        galaxies.add(g);

        g=new Galaxy("Small Magellonic Cloud",
                "The Small Magellanic Cloud, or Nubecula Minor, is a dwarf galaxy near the Milky Way. It is classified as a dwarf irregular galaxy.",
                R.drawable.smallamgellonic,"irregular");
        galaxies.add(g);

        g=new Galaxy("Centaurus A",
                " Centaurus A or NGC 5128 is a galaxy in the constellation of Centaurus. It was discovered in 1826 by Scottish astronomer James Dunlop from his home in Parramatta, in New South Wales, Australia.",
                R.drawable.centaurusa,"elliptical");
        galaxies.add(g);

        g=new Galaxy("Ursa Minor",
                "The Milky Way is the Galaxy that contains our Solar System." +
                        " The descriptive milky is derived from the appearance from Earth of the Galaxy – a band of light seen in the night sky formed from stars",
                R.drawable.ursaminor,"irregular");
        galaxies.add(g);

        g=new Galaxy("Large Magellonic Cloud",
                " The Large Magellanic Cloud is a satellite galaxy of the Milky Way. At a distance of 50 kiloparsecs, the LMC is the third-closest galaxy to the Milky Way, after the Sagittarius Dwarf Spheroidal and the.",
                R.drawable.largemagellonic,"irregular");
        galaxies.add(g);

        g=new Galaxy("Milky Way",
                "The Milky Way is the Galaxy that contains our Solar System." +
                        " The descriptive milky is derived from the appearance from Earth of the Galaxy – a band of light seen in the night sky formed from stars",
                R.drawable.milkyway,"spiral");
        galaxies.add(g);

        g=new Galaxy("Andromeda",
                "The Andromeda Galaxy, also known as Messier 31, M31, or NGC 224, is a spiral Galaxy approximately 780 kiloparsecs from Earth. It is the nearest major Galaxy to the Milky Way and was often referred to as the Great Andromeda Nebula in older texts.",
                R.drawable.andromeda,"irregular");
        galaxies.add(g);

        g=new Galaxy("Messier 81",
                "Messier 81 is a spiral Galaxy about 12 million light-years away in the constellation Ursa Major. Due to its proximity to Earth, large size and active galactic nucleus, Messier 81 has been studied extensively by professional astronomers.",
                R.drawable.messier81,"elliptical");
        galaxies.add(g);

        g=new Galaxy("Own Nebular",
                " The Owl Nebula is a planetary nebula located approximately 2,030 light years away in the constellation Ursa Major. It was discovered by French astronomer Pierre Méchain on February 16, 1781",
                R.drawable.ownnebular,"elliptical");
        galaxies.add(g);

        g=new Galaxy("Messier 87",
                "Messier 87 is a supergiant elliptical galaxy in the constellation Virgo. One of the most massive galaxies in the local universe, it is notable for its large population of globular clusters—M87 contains",
                R.drawable.messier87,"elliptical");
        galaxies.add(g);

        g=new Galaxy("Cosmos Redshift",
                "Cosmos Redshift 7 is a high-redshift Lyman-alpha emitter Galaxy, in the constellation Sextans, about 12.9 billion light travel distance years from Earth, reported to contain the first stars —formed ",
                R.drawable.cosmosredshift,"irregular");
        galaxies.add(g);

        g=new Galaxy("StarBust",
                "A starburst Galaxy is a Galaxy undergoing an exceptionally high rate of star formation, as compared to the long-term average rate of star formation in the Galaxy or the star formation rate observed in most other galaxies. ",
                R.drawable.starbust,"irregular");
        galaxies.add(g);

        g=new Galaxy("Sombrero",
                "Sombrero Galaxy is an unbarred spiral galaxy in the constellation Virgo located 31 million light-years from Earth. The galaxy has a diameter of approximately 50,000 light-years, 30% the size of the Milky Way.",
                R.drawable.sombrero,"spiral");
        galaxies.add(g);

        g=new Galaxy("Pinwheel",
                "The Pinwheel Galaxy is a face-on spiral galaxy distanced 21 million light-years away from earth in the constellation Ursa Major. ",
                R.drawable.pinwheel,"spiral");
        galaxies.add(g);


        g=new Galaxy("Canis Majos Overdensity",
                "The Canis Major Dwarf Galaxy or Canis Major Overdensity is a disputed dwarf irregular galaxy in the Local Group, located in the same part of the sky as the constellation Canis Major. ",
                R.drawable.canismajoroverdensity,"irregular");
        galaxies.add(g);

        g=new Galaxy("Virgo Stella Stream",
                " Group, located in the same part of the sky as the constellation Canis Major. ",
                R.drawable.virgostellarstream,"spiral");
        galaxies.add(g);

        return galaxies;
    }

}
