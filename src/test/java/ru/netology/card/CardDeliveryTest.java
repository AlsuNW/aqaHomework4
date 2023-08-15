package ru.netology.card;

import org.junit.jupiter.api.Test;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.SetValueOptions.withText;

public class CardDeliveryTest {
    @Test
    public void shouldTestDeliveryForm() {
        open("http://localhost:9999");

        $("[data-test-id='city'] input").setValue("Казань");
        $("[data-test-id='date'] input").setValue("19.08.2023");
        $("[data-test-id='name'] input").setValue("Иван Петров");
        $("[data-test-id='phone'] input").setValue("+79000000000");
        $("[data-test-id='agreement']").click();
        $(".button").click();
        $("[data-test-id='notification']").shouldBe(visible, Duration.ofSeconds(15));
    }
}
