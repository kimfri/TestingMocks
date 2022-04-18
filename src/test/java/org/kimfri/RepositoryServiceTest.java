package org.kimfri;

import org.assertj.core.api.Condition;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.when;

class RepositoryServiceTest {

    //@formatter:off
    @Mock MyRepository myRepositoryMock;
    //@formatter:on
    private RepositoryService repositoryService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        repositoryService = new RepositoryService(myRepositoryMock);
    }

    @Test
    void givenNoStrings_whenFetchingTheLongest_thenEmptyString() {
        final List<String> emptyList = List.of();

        given(myRepositoryMock.getAllStrings()).willReturn(emptyList);

        final String actual = repositoryService.getLongestString();
        final String expected = "Empty";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void givenStrings_whenFetchingTheLongest_thenTheLongest() {
        final String expected = "I'm the one";
        final List<String> emptyList = Arrays.asList("apa", "bepa", expected);
        when(myRepositoryMock.getAllStrings()).thenReturn(emptyList);

        final String actual = repositoryService.getLongestString();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void kalle() {
        assertThat("This is a String")
                .isNotNull()
                .startsWith("This")
                .hasSize(16);
        final List<String> stringList = Arrays.asList("apa");
        assertThat(stringList).isNotNull();
        assertThat(stringList.size())
                .isNotNull()
                .isOne();
    }
}
