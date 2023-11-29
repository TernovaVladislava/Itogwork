package homeworks.homework_006_var_002;

import java.util.*;

public class Homework {
    public static void main(String[] args) {
        Set<Laptop> laptops = new HashSet<>();

        laptops.add(Laptop.createLaptop(8, 128, "without os", "grey"));
        laptops.add(Laptop.createLaptop(8, 128, "without os", "black"));
        laptops.add(Laptop.createLaptop(8, 256, "without os", "black"));
        laptops.add(Laptop.createLaptop(12, 256, "without os", "black"));
        laptops.add(Laptop.createLaptop(12, 512, "without os", "black"));
        laptops.add(Laptop.createLaptop(16, 512, "without os", "black"));
        laptops.add(Laptop.createLaptop(16, 512, "without os", "grey"));
        laptops.add(Laptop.createLaptop(32, 512, "without os", "grey"));
        laptops.add(Laptop.createLaptop(32, 512, "without os", "black"));
        laptops.add(Laptop.createLaptop(64, 1024, "without os", "grey"));
        laptops.add(Laptop.createLaptop(8, 128, "windows", "black"));
        laptops.add(Laptop.createLaptop(8, 256, "windows", "black"));
        laptops.add(Laptop.createLaptop(8, 256, "windows", "grey"));
        laptops.add(Laptop.createLaptop(12, 512, "windows", "black"));
        laptops.add(Laptop.createLaptop(12, 512, "windows", "grey"));
        laptops.add(Laptop.createLaptop(12, 256, "windows", "grey"));
        laptops.add(Laptop.createLaptop(16, 256, "windows", "black"));
        laptops.add(Laptop.createLaptop(16, 512, "windows", "grey"));
        laptops.add(Laptop.createLaptop(16, 1024, "windows", "black"));
        laptops.add(Laptop.createLaptop(32, 1024, "windows", "white"));
        laptops.add(Laptop.createLaptop(8, 128, "linux", "white"));
        laptops.add(Laptop.createLaptop(8, 128, "linux", "black"));
        laptops.add(Laptop.createLaptop(8, 256, "linux", "white"));
        laptops.add(Laptop.createLaptop(12, 256, "linux", "grey"));
        laptops.add(Laptop.createLaptop(12, 256, "linux", "black"));
        laptops.add(Laptop.createLaptop(16, 256, "linux", "black"));
        laptops.add(Laptop.createLaptop(16, 512, "linux", "grey"));
        laptops.add(Laptop.createLaptop(16, 1024, "linux", "white"));
        laptops.add(Laptop.createLaptop(16, 1024, "linux", "grey"));
        laptops.add(Laptop.createLaptop(32, 1024, "linux", "white"));
        laptops.add(Laptop.createLaptop(16, 512, "mac os", "white"));
        laptops.add(Laptop.createLaptop(16, 512, "mac os", "black"));
        laptops.add(Laptop.createLaptop(32, 1024, "mac os", "white"));
        laptops.add(Laptop.createLaptop(32, 1024, "mac os", "black"));
        laptops.add(Laptop.createLaptop(64, 2048, "mac os", "grey"));

        List<String> criteria = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Р’РІРµРґРёС‚Рµ С‡РµСЂРµР· Р·Р°РїСЏС‚СѓСЋ РЅРѕРјРµСЂР° РєСЂРёС‚РµСЂРёРµРІ РґР»СЏ С„РёР»СЊС‚СЂР°С†РёРё:");
        System.out.println("1 - RAM");
        System.out.println("2 - ROM");
        System.out.println("3 - OS");
        System.out.println("4 - Color");
        System.out.println("5 - Р‘РµР· С„РёР»СЊС‚СЂР°С†РёРё");

        String criteriaInput = scanner.nextLine().toLowerCase();
        String[] selectedCriteria = criteriaInput.split(",");

        for (String selectedCriterion : selectedCriteria) {
            switch (selectedCriterion.trim()) {
                case "1":
                    System.out.println("Р’РІРµРґРёС‚Рµ РјРёРЅРёРјР°Р»СЊРЅС‹Р№ СЂР°Р·РјРµСЂ РѕРїРµСЂР°С‚РёРІРЅРѕР№ РїР°РјСЏС‚Рё (РѕС‚ 0 РґРѕ 64 Р“Р‘):");
                    int minRam = scanner.nextInt();
                    if (minRam < 0) {
                        System.out.println(
                                "Р Р°Р·РјРµСЂ РѕРїРµСЂР°С‚РёРІРЅРѕР№ РїР°РјСЏС‚Рё РЅРµ РјРѕР¶РµС‚ Р±С‹С‚СЊ РѕС‚СЂРёС†Р°С‚РµР»СЊРЅС‹Рј. " +
                                        "РђРєС‚РёРІРёСЂСѓР№С‚Рµ РїСЂРёР»РѕР¶РµРЅРёРµ Р·Р°РЅРѕРІРѕ.");
                        return;
                    } else {
                        criteria.add("ram:" + minRam);
                    }
                    break;
                case "2":
                    System.out.println("Р’РІРµРґРёС‚Рµ РјРёРЅРёРјР°Р»СЊРЅС‹Р№ СЂР°Р·РјРµСЂ Р¶С‘СЃС‚РєРѕРіРѕ РґРёСЃРєР° (РѕС‚ 0 РґРѕ 2024 Р“Р‘):");
                    int minRom = scanner.nextInt();
                    if (minRom < 0) {
                        System.out.println(
                                "РћР±СЉС‘Рј Р¶С‘СЃС‚РєРѕРіРѕ РґРёСЃРєР° РЅРµ РјРѕР¶РµС‚ Р±С‹С‚СЊ РѕС‚СЂРёС†Р°С‚РµР»СЊРЅС‹Рј. " +
                                        "РђРєС‚РёРІРёСЂСѓР№С‚Рµ РїСЂРёР»РѕР¶РµРЅРёРµ Р·Р°РЅРѕРІРѕ.");
                        return;
                    } else {
                        criteria.add("rom:" + minRom);
                    }
                    break;
                case "3":
                    System.out.println("Р’РІРµРґРёС‚Рµ Р¶РµР»Р°РµРјСѓСЋ РѕРїРµСЂР°С†РёРѕРЅРЅСѓСЋ СЃРёСЃС‚РµРјСѓ (without os, windows, linux, mac os):");
                    String os = scanner.next();
                    criteria.add("os:" + os);
                    break;
                case "4":
                    System.out.println("Р’РІРµРґРёС‚Рµ РїСЂРµРґРїРѕС‡РёС‚Р°РµРјС‹Р№ С†РІРµС‚ (black, white, grey):");
                    String color = scanner.next();
                    criteria.add("color:" + color);
                    break;
                case "5":
                    System.out.println("Р’С‹РІРѕРґ РІСЃРµС… РЅРѕСѓС‚Р±СѓРєРѕРІ Р±РµР· С„РёР»СЊС‚СЂР°С†РёРё:");
                    for (Laptop laptop : laptops) {
                        System.out.println(laptop);
                    }
                    return;
                default:
                    System.out.println(
                            "Р’С‹ РІРІРµР»Рё РЅРµРІРµСЂРЅС‹Р№ С„РёР»СЊС‚СЂ: " + selectedCriterion +
                            ". РђРєС‚РёРІРёСЂСѓР№С‚Рµ РїСЂРёР»РѕР¶РµРЅРёРµ Р·Р°РЅРѕРІРѕ.");
                    return;
            }
        }

        boolean hasMatch = false;

        for (Laptop laptop : laptops) {
            boolean isMatch = true;

            for (String criterion : criteria) {
                String[] parts = criterion.split(":");
                String property = parts[0];
                String value = parts[1];

                if (property.equals("ram") && (laptop.getRam() < Integer.parseInt(value))) {
                    isMatch = false;
                    break;
                } else if (property.equals("rom") && (laptop.getRom() < Integer.parseInt(value))) {
                    isMatch = false;
                    break;
                } else if (property.equals("os") && (!laptop.getOs().equalsIgnoreCase(value))) {
                    isMatch = false;
                    break;
                } else if (property.equals("color") && (!laptop.getColor().equalsIgnoreCase(value))) {
                    isMatch = false;
                    break;
                }
            }

            if (isMatch) {
                if (!hasMatch) {
                    System.out.println("РџРѕ РІС‹Р±СЂР°РЅРЅС‹Рј С„РёР»СЊС‚СЂР°Рј РІР°Рј РїРѕРґРѕР№РґСѓС‚ СЃР»РµРґСѓСЋС‰РёРµ РЅРѕСѓС‚Р±СѓРєРё:");
                    hasMatch = true;
                }
                System.out.println(laptop);
            }
        }

        if (!hasMatch) {
            System.out.println("РџРѕ РІС‹Р±СЂР°РЅРЅС‹Рј С„РёР»СЊС‚СЂР°Рј РЅРµ РЅР°Р№РґРµРЅ РЅРё РѕРґРёРЅ РЅРѕСѓС‚Р±СѓРє.");
        }
    }
}