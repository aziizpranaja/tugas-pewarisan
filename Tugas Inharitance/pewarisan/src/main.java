public class main 
{
    public static void main(String[] args) 
    {
        Team Evos = new Team("Evos Roar");

        Anggota orang_1 = new Anggota("Willy", 20);
        Anggota orang_2 = new Anggota("Andini", 21);
        Anggota orang_3 = new Anggota("Elsa", 22);

        Anggota orang_4 = new Trainee("Imam Bayhaqi", 25, 24);
        Anggota orang_5 = new Trainee("Rizal Bayhaqi", 26, 7);
        Anggota orang_6 = new Trainee("Akbar Rakasiwi", 27, 9);

        Evos.addAnggota(orang_1);
        Evos.addAnggota(orang_2);
        Evos.addAnggota(orang_3);
        Evos.addAnggota(orang_4);
        Evos.addAnggota(orang_5);
        Evos.addAnggota(orang_6);

        Evos.displayAllMember();
        Evos.displayAllTraine();
    }
    
}
