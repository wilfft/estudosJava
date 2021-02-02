package com.crashcourse.Optionals;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class optionals {
    public static void main(String[] args) {
	Optional<String> meuOptional = Optional.of("ESTOU PRESENTE VIU");
	meuOptional.ifPresentOrElse(System.out::println, () -> System.out.println("ESTOU NULO"));

	Optional<String> souNull = Optional.ofNullable(null);
	souNull.ifPresentOrElse(System.out::println, () -> System.out.println("ESTOU NULO"));

	Optional<String> souEmpty = Optional.empty(); // zerado, sem nenhum valor, vazio
	souNull.ifPresentOrElse(System.out::println, () -> System.out.println("ESTOU NULO"));

	// Optional<String> meuOfnulo = Optional.of(null);
	meuOptional.ifPresentOrElse(System.out::println, () -> System.out.println("ESTOU NULO"));
	// tambem temos para tipos primitivos

	OptionalInt.of(12).ifPresent(System.out::println);
	OptionalDouble.of(55.2).ifPresent(System.out::println);
	OptionalLong.of(25L).ifPresent(System.out::println);

	meuOptional.map((valor) -> valor.concat("****")).ifPresent(System.out::println);

    }

}
