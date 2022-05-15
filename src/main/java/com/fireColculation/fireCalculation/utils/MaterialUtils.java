package com.fireColculation.fireCalculation.utils;

import com.fireColculation.fireCalculation.dto.InputFormDto;
import com.fireColculation.fireCalculation.entities.Material;
import lombok.NonNull;
import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import static com.fireColculation.fireCalculation.constants.MaterialConstant.getAllMaterials;

@UtilityClass
@Slf4j
public class MaterialUtils {


    public static List<Material> noConflictMaterialListBuilder(@NonNull InputFormDto inputFormDto) {
        var materialList = new ArrayList<Material>();

        var first = inputFormDto.getFirst();
        if (isMaterialNotEmpty(first)) {
            materialList.add(getMaterialByNameAndWeight(first.getName(), first.getWeight()));
        }
        var second = inputFormDto.getSecond();
        if (isMaterialNotEmpty(second)) {
            materialList.add(getMaterialByNameAndWeight(second.getName(), second.getWeight()));
        }
        var third = inputFormDto.getThird();
        if (isMaterialNotEmpty(third)) {
            materialList.add(getMaterialByNameAndWeight(third.getName(), third.getWeight()));
        }
        var fourth = inputFormDto.getFourth();
        if (isMaterialNotEmpty(fourth)) {
            materialList.add(getMaterialByNameAndWeight(fourth.getName(), fourth.getWeight()));
        }
        var fifth = inputFormDto.getFifth();
        if (isMaterialNotEmpty(fifth)) {
            materialList.add(getMaterialByNameAndWeight(fifth.getName(), fifth.getWeight()));
        }
        var sixth = inputFormDto.getSixth();
        if (isMaterialNotEmpty(sixth)) {
            materialList.add(getMaterialByNameAndWeight(sixth.getName(), sixth.getWeight()));
        }

        return materialList;
    }

    private static Material getMaterialByNameAndWeight(@NonNull String materialName, @NonNull Double materialWeight) {
        if (materialName.equals("empty")) {
            return null;
        }
        var heatValue = getAllMaterials().get(materialName);

        return Material.builder()
                .name(materialName)
                .heatValue(heatValue)
                .weight(materialWeight)
                .resultHeatValue(heatValue * materialWeight).build();
    }

    private static boolean isMaterialNotEmpty(Material material) {
        return Objects.nonNull(Optional.ofNullable(material)
                .map(Material::getWeight)
                .orElse(null)) &&
                Objects.nonNull(getMaterialByNameAndWeight(material.getName(), material.getWeight()));
    }

    public static Material emptyMaterialBuilder() {
        return Material.builder()
                .name("")
                .heatValue(0.0)
                .weight(0.0)
                .resultHeatValue(0.0)
                .build();
    }
}
