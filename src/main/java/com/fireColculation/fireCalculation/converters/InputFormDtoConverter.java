package com.fireColculation.fireCalculation.converters;

import com.fireColculation.fireCalculation.dto.InputFormDto;
import com.fireColculation.fireCalculation.entities.Room;
import com.fireColculation.fireCalculation.repository.CalculationParams;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.Optional;

import static com.fireColculation.fireCalculation.utils.MaterialUtils.noConflictMaterialListBuilder;

@Component
@Getter
@AllArgsConstructor
public class InputFormDtoConverter {

//    public InputFormDto convertCalculatorParamsToDto(CalculationParams calculationParams){
//        var room  = calculationParams.getRoom();
//        var matreialsList = calculationParams.getMaterials();
//        return InputFormDto.builder()
//                .roomName(Optional.ofNullable(room)
//                        .map(Room::getRoomName)
//                        .orElse("Не указано название помещения"))
//                .roomSquare(Optional.ofNullable(room)
//                        .map(Room::getRoomSquare)
//                        .orElse(0.0))
//                .roomHeight(Optional.ofNullable(room)
//                        .map(Room::getRoomHeight)
//                        .orElse(0.0))
//                .distanceFromFireLoad(Optional.ofNullable(room)
//                        .map(Room::getDistanceFromFireLoad)
//                        .orElse(0.0))
//                .build();
//    }

    public static CalculationParams convertFromDtoToCalculatorParams(InputFormDto inputFormDto) {
        if (Objects.isNull(inputFormDto)) {
            return null;
        }
        return CalculationParams.builder()
                .room(Room.builder()
                        .roomName(Optional.ofNullable(inputFormDto.getRoomName()).orElse(null))
                        .roomHeight(Optional.ofNullable(inputFormDto.getRoomHeight()).orElse(null))
                        .roomSquare(Optional.ofNullable(inputFormDto.getRoomSquare()).orElse(null))
                        .distanceFromFireLoad(
                                Optional.ofNullable(inputFormDto.getDistanceFromFireLoad()).orElse(null)).build())
                .materials(noConflictMaterialListBuilder(inputFormDto)).build();
    }

//    .first(Optional.ofNullable(matreialsList).map(x-> x.get(0)).orElse(emptyMaterialBuilder()))
//            .second(Optional.ofNullable(matreialsList).map(x-> x.get(1)).orElse(emptyMaterialBuilder()))
//            .third(Optional.ofNullable(matreialsList).map(x-> x.get(2)).orElse(emptyMaterialBuilder()))
//            .fourth(Optional.ofNullable(matreialsList).map(x-> x.get(3)).orElse(emptyMaterialBuilder()))
//            .fifth(Optional.ofNullable(matreialsList).map(x-> x.get(4)).orElse(emptyMaterialBuilder()))
//            .sixth(Optional.ofNullable(matreialsList).map(x-> x.get(5)).orElse(emptyMaterialBuilder()))
}
