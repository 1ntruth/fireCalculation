package com.fireColculation.fireCalculation.constants;

import com.fireColculation.fireCalculation.entities.Material;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Константы материалов, где
 * name - наименование материала
 * heatValue  - удельная теплота сгорания материала
 */
@Getter
@AllArgsConstructor
public enum MaterialConstant {


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

    public static HashMap<String, Double> getAllMaterials(){
        var materials = new HashMap<String, Double>();
        materials.put(CAR.getName(), CAR.getHeatValue());
        materials.put(PEANUT.getName(), PEANUT.getHeatValue());
        materials.put(BREAD.getName(), BREAD.getHeatValue());
        materials.put(PAPER.getName(), PAPER.getHeatValue());
        materials.put(PEAS.getName(), PEAS.getHeatValue());
        materials.put(DERMANTINE.getName(), DERMANTINE.getHeatValue());
        materials.put(SOURDOUGH.getName(), SOURDOUGH.getHeatValue());
        materials.put(PAPERBOARD.getName(), PAPERBOARD.getHeatValue());
        materials.put(POTATO.getName(), POTATO.getHeatValue());
        materials.put(CHICKEN.getName(), CHICKEN.getHeatValue());
        materials.put(SKIN.getName(), SKIN.getHeatValue());
        materials.put(LINOLEUM.getName(), LINOLEUM.getHeatValue());
        materials.put(OIL.getName(), OIL.getHeatValue());
        materials.put(BUTTER.getName(), BUTTER.getHeatValue());
        materials.put(MILK.getName(), MILK.getHeatValue());
        materials.put(FLOUR.getName(), FLOUR.getHeatValue());
        materials.put(PLEX_GLASS.getName(), PLEX_GLASS.getHeatValue());
        materials.put(POLYURETHANE_FOAM.getName(), POLYURETHANE_FOAM.getHeatValue());
        materials.put(WASTE.getName(), WASTE.getHeatValue());
        materials.put(PLASTIC.getName(), PLASTIC.getHeatValue());
        materials.put(POLYVINYL.getName(), POLYVINYL.getHeatValue());
        materials.put(POLYPROPYLENE.getName(), POLYPROPYLENE.getHeatValue());
        materials.put(POLYSTYRENE.getName(), POLYSTYRENE.getHeatValue());
        materials.put(POLYETHYLENE.getName(), POLYETHYLENE.getHeatValue());
        materials.put(SEMI_FINISHED_MEAT.getName(), SEMI_FINISHED_MEAT.getHeatValue());
        materials.put(SEMI_FINISHED_FISH.getName(), SEMI_FINISHED_FISH.getHeatValue());
        materials.put(WIRES.getName(), WIRES.getHeatValue());
        materials.put(RUBBER.getName(), RUBBER.getHeatValue());
        materials.put(SUGAR.getName(), SUGAR.getHeatValue());
        materials.put(CREAM.getName(), CREAM.getHeatValue());
        materials.put(ALCOHOL.getName(), ALCOHOL.getHeatValue());
        materials.put(FIBERGLASS.getName(), FIBERGLASS.getHeatValue());
        materials.put(DRY_INSTANT_DRINK.getName(), DRY_INSTANT_DRINK.getHeatValue());
        materials.put(SEMI_FINISHED_CHEESE.getName(), SEMI_FINISHED_CHEESE.getHeatValue());
        materials.put(CHEESE.getName(), CHEESE.getHeatValue());
        materials.put(TOBACCO.getName(), TOBACCO.getHeatValue());
        materials.put(TEXTILE.getName(), TEXTILE.getHeatValue());
        materials.put(COAL.getName(), COAL.getHeatValue());
        materials.put(PACKAGING.getName(), PACKAGING.getHeatValue());
        materials.put(FREON.getName(), FREON.getHeatValue());
        materials.put(WHEAT_BREAD.getName(), WHEAT_BREAD.getHeatValue());
        materials.put(COTTON.getName(), COTTON.getHeatValue());
        materials.put(COTTON_WITH_NYLON.getName(), COTTON_WITH_NYLON.getHeatValue());
        materials.put(TEA.getName(), TEA.getHeatValue());
        materials.put(WOOL.getName(), WOOL.getHeatValue());
        materials.put(ETHANOL.getName(), ETHANOL.getHeatValue());
        materials.put(CHLORAMINE.getName(), CHLORAMINE.getHeatValue());
        materials.put(POLYURETHANE.getName(), POLYURETHANE.getHeatValue());
        materials.put(ALCOHOL_ISOPROPYL.getName(), ALCOHOL_ISOPROPYL.getHeatValue());
        materials.put(PROPYLENE.getName(), PROPYLENE.getHeatValue());
        materials.put(POLYETHYLENE_GLYCOL.getName(), POLYETHYLENE_GLYCOL.getHeatValue());
        materials.put(OLEIC.getName(), OLEIC.getHeatValue());
        materials.put(PROPANOL.getName(), PROPANOL.getHeatValue());
        materials.put(ETH_OXY_DI_GLYCOL.getName(), ETH_OXY_DI_GLYCOL.getHeatValue());
        materials.put(PEACH_OIL.getName(), PEACH_OIL.getHeatValue());
        return materials;
    }
}
