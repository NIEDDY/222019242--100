class Country {
    String name = "Country";
    public void countryname()
   {System.out.println("Selected country is kenya");}}
   
   class Province extends Country{
    String  provinceN = "8 provinces";
    public void provincen(){
        System.out.println("The number of province is 8");

    }}
   class District extends Province{
    String DistrictN = "46 districts";
    public void Districtn(){
        System.out.println("The number of districs of kenya is 46");
    }}

   class Community extends District{
    String PopulationN = "55.1 Millions";
    public void Populationn(){
        System.out.println("The total pupulation is 55.1 Millions");
    }}
    //interface community implements province{
        class main{
            public static void main(String[]args){
                Community obj = new Community();
                obj.countryname();
                obj.provincen();
                obj.Districtn();
                obj.Populationn();
                
            }
        }
