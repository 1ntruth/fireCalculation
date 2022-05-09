package com.fireColculation.fireCalculation.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;

/**
 * Константы материалов, где
 * name - наименование материала
 * heatValue  - удельная теплота сгорания материала
 */
@Getter
@AllArgsConstructor
public enum Materials {


    CAR(0,"Автомобиль", 31.70),
    PEANUT(1,"Арахис", 22.52),
    BREAD(2,"Булка сдобная", 12.35),
    PAPER(3,"Бумага", 13.40),
    PEAS(4,"Горох", 12.40),
    WOOD(5,"Дерево", 13.80),
    DERMANTINE(6,"Дермантин", 21.53),
    SOURDOUGH(7,"Закваска сырная - порошок", 19.80),
    SEED(8,"Зерно", 16.80),
    PAPERBOARD(9,"Картон", 13.40),
    POTATO(10,"Картофель", 1.25),
    CHICKEN(11,"Кура", 5.36),
    SKIN(12,"Кожа", 21.00),
    LINOLEUM(13,"Линолеум ПВХ", 14.31),
    OIL(14,"Масло растительное", 39.52),
    BUTTER(15,"Масло сливочное", 30.96),
    MILK(16,"Молоко", 0.44),
    FLOUR(17,"Мука", 16.80),
    PLEX_GLASS(18,"Оргстекло", 25.00),
    POLYURETHANE_FOAM(19,"Пенополиуретан (поролон)", 24.30),
    WASTE(20,"Пищевые отходы", 5.98),
    PLASTIC(21,"Пластмасса", 41.87),
    POLYVINYL(22,"Поливинилхлорид", 20.70),
    POLYPROPYLENE(23,"Полипропилен", 45.67),
    POLYSTYRENE(24,"Полистирол", 39.00),
    POLYETHYLENE(25,"Полиэтилен", 47.14),
    SEMI_FINISHED_MEAT(26,"Полуфабрикаты мясные", 10.20),
    SEMI_FINISHED_FISH(27,"Полуфабрикаты рыбные", 10.50),
    WIRES(28,"Провода в изоляции", 37.80),
    RUBBER(29,"Резина", 33.52),
    SUGAR(30,"Сахар", 16.80),
    CREAM(31,"Сливки 20%", 5.23),
    ALCOHOL(32,"Спирт эт. 96%", 27.20),
    FIBERGLASS(33,"Стеклопластик", 15.00),
    DRY_INSTANT_DRINK(34,"Сухой растворимый напиток", 16.47),
    SEMI_FINISHED_CHEESE(35,"Сыр - полуфабрикат", 8.10),
    CHEESE(36,"Сыр полутвердый", 15.76),
    TOBACCO(37,"Табак", 16.00),
    TEXTILE(38,"Текстиль", 24.47),
    COAL(39,"Уголь", 33.90),
    PACKAGING(40,"Упаковка: бумага + пластик", 23.54),
    FREON(41,"Фреон", 45.90),
    WHEAT_BREAD(42,"Хлеб пш. в/с", 9.96),
    COTTON(43,"Хлопок", 15.70),
    COTTON_WITH_NYLON(44,"Хлопок + капрон", 16.20),
    TEA(45,"Чай", 7.78),
    WOOL(46,"Шерсть (ткань шерстяная)", 23.00),
    ETHANOL(47,"Этанол", 30.56),
    CHLORAMINE(48,"Хлорамин", 18.03),
    POLYURETHANE(49,"Полиуретан", 33.50),
    ALCOHOL_ISOPROPYL(50,"Изопропиловый спирт", 34.20),
    HAIR(51,"Волосы", 24.00),
    PROPYLENE(52,"Пропиленгликоль", 23.95),
    POLYETHYLENE_GLYCOL(53,"Полиэтиленгликоль", 23.95),
    OLEIC(54,"Олеиновая кислота", 37.50),
    PROPANOL(55,"2-амино2-метил1-пропанол", 12.60),
    ETH_OXY_DI_GLYCOL(56,"Этоксидигликоль", 25.07),
    PEACH_OIL(57,"Масло персика", 37.50);

    private final Integer id;
    private final String name;
    private final Double heatValue;

    public static HashMap<String, Materials> getAllMaterials(){
        var materials = new HashMap<String, Materials>();
        materials.put(CAR.getName(), CAR);
        materials.put(PEANUT.getName(), PEANUT);
        materials.put(BREAD.getName(), BREAD);
        materials.put(PAPER.getName(), PAPER);
        materials.put(PEAS.getName(), PEAS);
        materials.put(DERMANTINE.getName(), DERMANTINE);
        materials.put(SOURDOUGH.getName(), SOURDOUGH);
        materials.put(PAPERBOARD.getName(), PAPERBOARD);
        materials.put(POTATO.getName(), POTATO);
        materials.put(CHICKEN.getName(), CHICKEN);
        materials.put(SKIN.getName(), SKIN);
        materials.put(LINOLEUM.getName(), LINOLEUM);
        materials.put(OIL.getName(), OIL);
        materials.put(BUTTER.getName(), BUTTER);
        materials.put(MILK.getName(), MILK);
        materials.put(FLOUR.getName(), FLOUR);
        materials.put(PLEX_GLASS.getName(), PLEX_GLASS);
        materials.put(POLYURETHANE_FOAM.getName(), POLYURETHANE_FOAM);
        materials.put(WASTE.getName(), WASTE);
        materials.put(PLASTIC.getName(), PLASTIC);
        materials.put(POLYVINYL.getName(), POLYVINYL);
        materials.put(POLYPROPYLENE.getName(), POLYPROPYLENE);
        materials.put(POLYSTYRENE.getName(), POLYSTYRENE);
        materials.put(POLYETHYLENE.getName(), POLYETHYLENE);
        materials.put(SEMI_FINISHED_MEAT.getName(), SEMI_FINISHED_MEAT);
        materials.put(SEMI_FINISHED_FISH.getName(), SEMI_FINISHED_FISH);
        materials.put(WIRES.getName(), WIRES);
        materials.put(RUBBER.getName(), RUBBER);
        materials.put(SUGAR.getName(), SUGAR);
        materials.put(CREAM.getName(), CREAM);
        materials.put(ALCOHOL.getName(), ALCOHOL);
        materials.put(FIBERGLASS.getName(), FIBERGLASS);
        materials.put(DRY_INSTANT_DRINK.getName(), DRY_INSTANT_DRINK);
        materials.put(SEMI_FINISHED_CHEESE.getName(), SEMI_FINISHED_CHEESE);
        materials.put(CHEESE.getName(), CHEESE);
        materials.put(TOBACCO.getName(), TOBACCO);
        materials.put(TEXTILE.getName(), TEXTILE);
        materials.put(COAL.getName(), COAL);
        materials.put(PACKAGING.getName(), PACKAGING);
        materials.put(FREON.getName(), FREON);
        materials.put(WHEAT_BREAD.getName(), WHEAT_BREAD);
        materials.put(COTTON.getName(), COTTON);
        materials.put(COTTON_WITH_NYLON.getName(), COTTON_WITH_NYLON);
        materials.put(TEA.getName(), TEA);
        materials.put(WOOL.getName(), WOOL);
        materials.put(ETHANOL.getName(), ETHANOL);
        materials.put(CHLORAMINE.getName(), CHLORAMINE);
        materials.put(POLYURETHANE.getName(), POLYURETHANE);
        materials.put(ALCOHOL_ISOPROPYL.getName(), ALCOHOL_ISOPROPYL);
        materials.put(PROPYLENE.getName(), PROPYLENE);
        materials.put(POLYETHYLENE_GLYCOL.getName(), POLYETHYLENE_GLYCOL);
        materials.put(OLEIC.getName(), OLEIC);
        materials.put(PROPANOL.getName(), PROPANOL);
        materials.put(ETH_OXY_DI_GLYCOL.getName(), ETH_OXY_DI_GLYCOL);
        materials.put(PEACH_OIL.getName(), PEACH_OIL);
        return materials;
    }

}
