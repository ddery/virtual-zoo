import org.junit.*;
import static org.junit.Assert.*;

/**
 * @author      Abdurrahman <13515024@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
@SuppressWarnings("ALL")
public class AnimalTest {
    @Test
    public void BunglonTest() {
        Animal bunglon = new Animal("Bunglon");
        assertTrue(bunglon.getName().equals("Bunglon"));
        assertTrue(bunglon.isTamed());
        assertTrue(bunglon.getBioType()=='L');
        assertTrue(bunglon.getDietType()=='C');
        assertTrue(bunglon.getWeight()==1);
        assertTrue(bunglon.getCode()=='B');
    }
    @Test
    public void BurungUntaTest() {
        Animal burungUnta = new Animal("Burung Unta");
        assertTrue(burungUnta.getName().equals("Burung Unta"));
        assertTrue(burungUnta.isTamed());
        assertTrue(burungUnta.getBioType()=='A');
        assertTrue(burungUnta.getDietType()=='H');
        assertTrue(burungUnta.getWeight()==145);
        assertTrue(burungUnta.getCode()=='U');
    }
    @Test
    public void CendrawasiTest() {
        Animal cendrawasi = new Animal("Cendrawasi");
        assertTrue(cendrawasi.getName().equals("Cendrawasi"));
        assertTrue(cendrawasi.isTamed());
        assertTrue(cendrawasi.getBioType()=='A');
        assertTrue(cendrawasi.getDietType()=='H');
        assertTrue(cendrawasi.getWeight()==0.5);
        assertTrue(cendrawasi.getCode()=='C');
    }
    @Test
    public void ElangTest() {
        Animal elang = new Animal("Elang");
        assertTrue(elang.getName().equals("Elang"));
        assertTrue(elang.isTamed());
        assertTrue(elang.getBioType()=='A');
        assertTrue(elang.getDietType()=='C');
        assertTrue(elang.getWeight()==1);
        assertTrue(elang.getCode()=='E');
    }
    @Test
    public void FlamingoTest() {
        Animal flamingo = new Animal("Flamingo");
        assertTrue(flamingo.getName().equals("Flamingo"));
        assertTrue(flamingo.isTamed());
        assertTrue(flamingo.getBioType()=='A');
        assertTrue(flamingo.getDietType()=='C');
        assertTrue(flamingo.getWeight()==2);
        assertTrue(flamingo.getCode()=='F');
    }
    @Test
    public void GajahTest() {
        Animal gajah = new Animal("Gajah");
        assertTrue(gajah.getName().equals("Gajah"));
        assertTrue(gajah.isTamed());
        assertTrue(gajah.getBioType()=='L');
        assertTrue(gajah.getDietType()=='H');
        assertTrue(gajah.getWeight()==5000);
        assertTrue(gajah.getCode()=='G');
    }
    @Test
    public void GoliathFrogTest() {
        Animal goliathFrog = new Animal("Goliath Frog");
        assertTrue(goliathFrog.getName().equals("Goliath Frog"));
        assertTrue(goliathFrog.isTamed());
        assertTrue(goliathFrog.getBioType()=='L');
        assertTrue(goliathFrog.getDietType()=='C');
        assertTrue(goliathFrog.getWeight()==3);
        assertTrue(goliathFrog.getCode()=='f');
    }
    @Test
    public void GorillaTest() {
        Animal gorilla = new Animal("Gorilla");
        assertTrue(gorilla.getName().equals("Gorilla"));
        assertTrue(gorilla.isTamed());
        assertTrue(gorilla.getBioType()=='L');
        assertTrue(gorilla.getDietType()=='H');
        assertTrue(gorilla.getWeight()==200);
        assertTrue(gorilla.getCode()=='g');
    }
    @Test
    public void HarimauTest() {
        Animal harimau = new Animal("Harimau");
        assertTrue(harimau.getName().equals("Harimau"));
        assertTrue(harimau.isTamed());
        assertTrue(harimau.getBioType()=='L');
        assertTrue(harimau.getDietType()=='C');
        assertTrue(harimau.getWeight()==210);
        assertTrue(harimau.getCode()=='H');
    }
    @Test
    public void KomodoTest() {
        Animal komodo = new Animal("Komodo");
        assertTrue(komodo.getName().equals("Komodo"));
        assertTrue(komodo.isTamed());
        assertTrue(komodo.getBioType()=='L');
        assertTrue(komodo.getDietType()=='C');
        assertTrue(komodo.getWeight()==70);
        assertTrue(komodo.getCode()=='K');
    }
    @Test
    public void LumbaLumbaTest() {
        Animal lumbaLumba = new Animal("Lumba lumba");
        assertTrue(lumbaLumba.getName().equals("Lumba lumba"));
        assertTrue(lumbaLumba.isTamed());
        assertTrue(lumbaLumba.getBioType()=='W');
        assertTrue(lumbaLumba.getDietType()=='C');
        assertTrue(lumbaLumba.getWeight()==635);
        assertTrue(lumbaLumba.getCode()=='L');
    }
    @Test
    public void MerakTest() {
        Animal merak = new Animal("Merak");
        assertTrue(merak.getName().equals("Merak"));
        assertTrue(merak.isTamed());
        assertTrue(merak.getBioType()=='A');
        assertTrue(merak.getDietType()=='H');
        assertTrue(merak.getWeight()==8);
        assertTrue(merak.getCode()=='M');
    }
    @Test
    public void OrangutanTest() {
        Animal orangutan = new Animal("Orangutan");
        assertTrue(orangutan.getName().equals("Orangutan"));
        assertTrue(orangutan.isTamed());
        assertTrue(orangutan.getBioType()=='L');
        assertTrue(orangutan.getDietType()=='H');
        assertTrue(orangutan.getWeight()==80);
        assertTrue(orangutan.getCode()=='O');
    }
    @Test
    public void PandaTest() {
        Animal panda = new Animal("Panda");
        assertTrue(panda.getName().equals("Panda"));
        assertTrue(panda.isTamed());
        assertTrue(panda.getBioType()=='L');
        assertTrue(panda.getDietType()=='H');
        assertTrue(panda.getWeight()==100);
        assertTrue(panda.getCode()=='P');
    }
    @Test
    public void PariTest() {
        Animal pari = new Animal("Pari");
        assertTrue(pari.getName().equals("Pari"));
        assertTrue(pari.isTamed());
        assertTrue(pari.getBioType()=='W');
        assertTrue(pari.getDietType()=='C');
        assertTrue(pari.getWeight()==100);
        assertTrue(pari.getCode()=='p');
    }
    @Test
    public void PausHumpbackTest() {
        Animal pausHumpback = new Animal("Paus Humpback");
        assertTrue(pausHumpback.getName().equals("Paus Humpback"));
        assertTrue(pausHumpback.isTamed());
        assertTrue(pausHumpback.getBioType()=='W');
        assertTrue(pausHumpback.getDietType()=='C');
        assertTrue(pausHumpback.getWeight()==36000);
        assertTrue(pausHumpback.getCode()=='h');
    }
    @Test
    public void PinguinTest() {
        Animal pinguin = new Animal("Pinguin");
        assertTrue(pinguin.getName().equals("Pinguin"));
        assertTrue(pinguin.isTamed());
        assertTrue(pinguin.getBioType()=='A');
        assertTrue(pinguin.getDietType()=='H');
        assertTrue(pinguin.getWeight()==30);
        assertTrue(pinguin.getCode()=='N');
    }
    @Test
    public void PumaTest() {
        Animal puma = new Animal("Puma");
        assertTrue(puma.getName().equals("Puma"));
        assertTrue(puma.isTamed());
        assertTrue(puma.getBioType()=='L');
        assertTrue(puma.getDietType()=='C');
        assertTrue(puma.getWeight()==180);
        assertTrue(puma.getCode()=='m');
    }
    @Test
    public void SalamanderTest() {
        Animal salamander = new Animal("Salamander");
        assertTrue(salamander.getName().equals("Salamander"));
        assertTrue(salamander.isTamed());
        assertTrue(salamander.getBioType()=='z');
        assertTrue(salamander.getDietType()=='H');
        assertTrue(salamander.getWeight()==1);
        assertTrue(salamander.getCode()=='S');
    }
    @Test
    public void SalmonTest() {
        Animal salmon = new Animal("Salmon");
        assertTrue(salmon.getName().equals("Salmon"));
        assertTrue(salmon.isTamed());
        assertTrue(salmon.getBioType()=='W');
        assertTrue(salmon.getDietType()=='C');
        assertTrue(salmon.getWeight()==4);
        assertTrue(salmon.getCode()=='s');
    }
    @Test
    public void SimpanzeTest() {
        Animal simpanze = new Animal("Simpanze");
        assertTrue(simpanze.getName().equals("Simpanze"));
        assertTrue(simpanze.isTamed());
        assertTrue(simpanze.getBioType()=='L');
        assertTrue(simpanze.getDietType()=='H');
        assertTrue(simpanze.getWeight()==70);
        assertTrue(simpanze.getCode()=='z');
    }
    @Test
    public void SingaTest() {
        Animal singa = new Animal("Singa");
        assertTrue(singa.getName().equals("Singa"));
        assertTrue(singa.isTamed());
        assertTrue(singa.getBioType()=='L');
        assertTrue(singa.getDietType()=='C');
        assertTrue(singa.getWeight()==200);
        assertTrue(singa.getCode()=='X');
    }
}
