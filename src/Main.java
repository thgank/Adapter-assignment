public class Main {
    public static void main(String[] args) {
        MultiCharger typeCChargerAdapter = new ChargerAdapter("android");
        MultiCharger lightningChargerAdapter = new ChargerAdapter("apple");

        System.out.println("charging POCO X3 PRO ULTRA AI 48MP CAMERA:");
        typeCChargerAdapter.charge();

        System.out.println("\ncharging apple device:");
        lightningChargerAdapter.charge();

        MultiCharger unsupportedCharger = new ChargerAdapter("Nokia 3310");
        System.out.println("\nincompatible device: ");
        unsupportedCharger.charge();
    }
}