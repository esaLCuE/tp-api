package fr.afpa.pompey.cda.api.service;

import fr.afpa.pompey.cda.api.model.Person;
import fr.afpa.pompey.cda.api.repository.PersonRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class PersonServiceMockTest {
    @Mock
    private PersonRepository personRepository;

    @InjectMocks
    private PersonService personService;

    @Test
    public void GetPersonByIdTest(){
        Person person = new Person();
        person.setId(1);
        person.setFirstName("John");
        person.setLastName("Doe");

        when(personRepository.findById(1)).thenReturn(Optional.of(person));

        Optional<Person> result = personService.getPerson(1);

        verify(personRepository, times(1)).findById(1);
        assertThat(result.isPresent()).isTrue();
        assertThat(result.get().getId()).isEqualTo(1);
        assertThat(result.get().getFirstName()).isEqualTo("John");
        assertThat(result.get().getLastName()).isEqualTo("Doe");
    }
}