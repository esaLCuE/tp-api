package fr.afpa.pompey.cda.api.controller;

import fr.afpa.pompey.cda.api.model.Person;
import fr.afpa.pompey.cda.api.service.PersonService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class PersonControllerMockTest {
    @Mock
    private PersonService personService;

    @InjectMocks
    private PersonController personController;

    @Test
    public void testGetPersonByIdTest() throws Exception {
        Person person = new Person();
        person.setId(1);
        person.setFirstName("John");
        person.setLastName("Doe");

        when(personService.getPerson(1)).thenReturn(Optional.of(person));

        Optional<Person> responseEntity = Optional.ofNullable(personController.getPersonById(1));

        assertThat(responseEntity.isPresent()).isTrue();
        assertThat(responseEntity.get().getId()).isEqualTo(1);
        assertThat(responseEntity.get().getFirstName()).isEqualTo("John");
        assertThat(responseEntity.get().getLastName()).isEqualTo("Doe");
    }
}