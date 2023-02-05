package org.nzbhydra.searching.dtoseventsenums;

import org.assertj.core.api.AbstractObjectAssert;
import org.assertj.core.internal.Iterables;
import org.assertj.core.util.Objects;

/**
 * Abstract base class for {@link SearchRequestParameters} specific assertions - Generated by CustomAssertionGenerator.
 */
@jakarta.annotation.Generated(value = "assertj-assertions-generator")
public abstract class AbstractSearchRequestParametersAssert<S extends AbstractSearchRequestParametersAssert<S, A>, A extends SearchRequestParameters> extends AbstractObjectAssert<S, A> {

    /**
     * Creates a new <code>{@link AbstractSearchRequestParametersAssert}</code> to make assertions on actual SearchRequestParameters.
     *
     * @param actual the SearchRequestParameters we want to make assertions on.
     */
    protected AbstractSearchRequestParametersAssert(A actual, Class<S> selfType) {
        super(actual, selfType);
    }

    /**
     * Verifies that the actual SearchRequestParameters's category is equal to the given one.
     *
     * @param category the given category to compare the actual SearchRequestParameters's category to.
     * @return this assertion object.
     * @throws AssertionError - if the actual SearchRequestParameters's category is not equal to the given one.
     */
    public S hasCategory(String category) {
        // check that actual SearchRequestParameters we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting category of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualCategory = actual.getCategory();
        if (!Objects.areEqual(actualCategory, category)) {
            failWithMessage(assertjErrorMessage, actual, category, actualCategory);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual SearchRequestParameters's episode is equal to the given one.
     *
     * @param episode the given episode to compare the actual SearchRequestParameters's episode to.
     * @return this assertion object.
     * @throws AssertionError - if the actual SearchRequestParameters's episode is not equal to the given one.
     */
    public S hasEpisode(String episode) {
        // check that actual SearchRequestParameters we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting episode of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualEpisode = actual.getEpisode();
        if (!Objects.areEqual(actualEpisode, episode)) {
            failWithMessage(assertjErrorMessage, actual, episode, actualEpisode);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual SearchRequestParameters's imdbId is equal to the given one.
     *
     * @param imdbId the given imdbId to compare the actual SearchRequestParameters's imdbId to.
     * @return this assertion object.
     * @throws AssertionError - if the actual SearchRequestParameters's imdbId is not equal to the given one.
     */
    public S hasImdbId(String imdbId) {
        // check that actual SearchRequestParameters we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting imdbId of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualImdbId = actual.getImdbId();
        if (!Objects.areEqual(actualImdbId, imdbId)) {
            failWithMessage(assertjErrorMessage, actual, imdbId, actualImdbId);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual SearchRequestParameters's indexers contains the given String elements.
     *
     * @param indexers the given elements that should be contained in actual SearchRequestParameters's indexers.
     * @return this assertion object.
     * @throws AssertionError if the actual SearchRequestParameters's indexers does not contain all given String elements.
     */
    public S hasIndexers(String... indexers) {
        // check that actual SearchRequestParameters we want to make assertions on is not null.
        isNotNull();

        // check that given String varargs is not null.
        if (indexers == null) {
            failWithMessage("Expecting indexers parameter not to be null.");
        }

        // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
        Iterables.instance().assertContains(info, actual.getIndexers(), indexers);

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual SearchRequestParameters's indexers contains the given String elements in Collection.
     *
     * @param indexers the given elements that should be contained in actual SearchRequestParameters's indexers.
     * @return this assertion object.
     * @throws AssertionError if the actual SearchRequestParameters's indexers does not contain all given String elements.
     */
    public S hasIndexers(java.util.Collection<? extends String> indexers) {
        // check that actual SearchRequestParameters we want to make assertions on is not null.
        isNotNull();

        // check that given String collection is not null.
        if (indexers == null) {
            failWithMessage("Expecting indexers parameter not to be null.");
            return myself; // to fool Eclipse "Null pointer access" warning on toArray.
        }

        // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
        Iterables.instance().assertContains(info, actual.getIndexers(), indexers.toArray());

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual SearchRequestParameters's indexers contains <b>only</b> the given String elements and nothing else in whatever order.
     *
     * @param indexers the given elements that should be contained in actual SearchRequestParameters's indexers.
     * @return this assertion object.
     * @throws AssertionError if the actual SearchRequestParameters's indexers does not contain all given String elements.
     */
    public S hasOnlyIndexers(String... indexers) {
        // check that actual SearchRequestParameters we want to make assertions on is not null.
        isNotNull();

        // check that given String varargs is not null.
        if (indexers == null) {
            failWithMessage("Expecting indexers parameter not to be null.");
        }

        // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
        Iterables.instance().assertContainsOnly(info, actual.getIndexers(), indexers);

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual SearchRequestParameters's indexers contains <b>only</b> the given String elements in Collection and nothing else in whatever order.
     *
     * @param indexers the given elements that should be contained in actual SearchRequestParameters's indexers.
     * @return this assertion object.
     * @throws AssertionError if the actual SearchRequestParameters's indexers does not contain all given String elements.
     */
    public S hasOnlyIndexers(java.util.Collection<? extends String> indexers) {
        // check that actual SearchRequestParameters we want to make assertions on is not null.
        isNotNull();

        // check that given String collection is not null.
        if (indexers == null) {
            failWithMessage("Expecting indexers parameter not to be null.");
            return myself; // to fool Eclipse "Null pointer access" warning on toArray.
        }

        // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
        Iterables.instance().assertContainsOnly(info, actual.getIndexers(), indexers.toArray());

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual SearchRequestParameters's indexers does not contain the given String elements.
     *
     * @param indexers the given elements that should not be in actual SearchRequestParameters's indexers.
     * @return this assertion object.
     * @throws AssertionError if the actual SearchRequestParameters's indexers contains any given String elements.
     */
    public S doesNotHaveIndexers(String... indexers) {
        // check that actual SearchRequestParameters we want to make assertions on is not null.
        isNotNull();

        // check that given String varargs is not null.
        if (indexers == null) {
            failWithMessage("Expecting indexers parameter not to be null.");
        }

        // check with standard error message (use overridingErrorMessage before contains to set your own message).
        Iterables.instance().assertDoesNotContain(info, actual.getIndexers(), indexers);

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual SearchRequestParameters's indexers does not contain the given String elements in Collection.
     *
     * @param indexers the given elements that should not be in actual SearchRequestParameters's indexers.
     * @return this assertion object.
     * @throws AssertionError if the actual SearchRequestParameters's indexers contains any given String elements.
     */
    public S doesNotHaveIndexers(java.util.Collection<? extends String> indexers) {
        // check that actual SearchRequestParameters we want to make assertions on is not null.
        isNotNull();

        // check that given String collection is not null.
        if (indexers == null) {
            failWithMessage("Expecting indexers parameter not to be null.");
            return myself; // to fool Eclipse "Null pointer access" warning on toArray.
        }

        // check with standard error message (use overridingErrorMessage before contains to set your own message).
        Iterables.instance().assertDoesNotContain(info, actual.getIndexers(), indexers.toArray());

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual SearchRequestParameters has no indexers.
     *
     * @return this assertion object.
     * @throws AssertionError if the actual SearchRequestParameters's indexers is not empty.
     */
    public S hasNoIndexers() {
        // check that actual SearchRequestParameters we want to make assertions on is not null.
        isNotNull();

        // we override the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting :\n  <%s>\nnot to have indexers but had :\n  <%s>";

        // check
        if (actual.getIndexers().iterator().hasNext()) {
            failWithMessage(assertjErrorMessage, actual, actual.getIndexers());
        }

        // return the current assertion for method chaining
        return myself;
    }


    /**
     * Verifies that the actual SearchRequestParameters's limit is equal to the given one.
     *
     * @param limit the given limit to compare the actual SearchRequestParameters's limit to.
     * @return this assertion object.
     * @throws AssertionError - if the actual SearchRequestParameters's limit is not equal to the given one.
     */
    public S hasLimit(Integer limit) {
        // check that actual SearchRequestParameters we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting limit of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        Integer actualLimit = actual.getLimit();
        if (!Objects.areEqual(actualLimit, limit)) {
            failWithMessage(assertjErrorMessage, actual, limit, actualLimit);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual SearchRequestParameters is load all.
     *
     * @return this assertion object.
     * @throws AssertionError - if the actual SearchRequestParameters is not load all.
     */
    public S isLoadAll() {
        // check that actual SearchRequestParameters we want to make assertions on is not null.
        isNotNull();

        // check that property call/field access is true
        if (!actual.isLoadAll()) {
            failWithMessage("\nExpecting that actual SearchRequestParameters is load all but is not.");
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual SearchRequestParameters is not load all.
     *
     * @return this assertion object.
     * @throws AssertionError - if the actual SearchRequestParameters is load all.
     */
    public S isNotLoadAll() {
        // check that actual SearchRequestParameters we want to make assertions on is not null.
        isNotNull();

        // check that property call/field access is false
        if (actual.isLoadAll()) {
            failWithMessage("\nExpecting that actual SearchRequestParameters is not load all but is.");
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual SearchRequestParameters's maxage is equal to the given one.
     *
     * @param maxage the given maxage to compare the actual SearchRequestParameters's maxage to.
     * @return this assertion object.
     * @throws AssertionError - if the actual SearchRequestParameters's maxage is not equal to the given one.
     */
    public S hasMaxage(Integer maxage) {
        // check that actual SearchRequestParameters we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting maxage of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        Integer actualMaxage = actual.getMaxage();
        if (!Objects.areEqual(actualMaxage, maxage)) {
            failWithMessage(assertjErrorMessage, actual, maxage, actualMaxage);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual SearchRequestParameters's maxsize is equal to the given one.
     *
     * @param maxsize the given maxsize to compare the actual SearchRequestParameters's maxsize to.
     * @return this assertion object.
     * @throws AssertionError - if the actual SearchRequestParameters's maxsize is not equal to the given one.
     */
    public S hasMaxsize(Integer maxsize) {
        // check that actual SearchRequestParameters we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting maxsize of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        Integer actualMaxsize = actual.getMaxsize();
        if (!Objects.areEqual(actualMaxsize, maxsize)) {
            failWithMessage(assertjErrorMessage, actual, maxsize, actualMaxsize);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual SearchRequestParameters's minage is equal to the given one.
     *
     * @param minage the given minage to compare the actual SearchRequestParameters's minage to.
     * @return this assertion object.
     * @throws AssertionError - if the actual SearchRequestParameters's minage is not equal to the given one.
     */
    public S hasMinage(Integer minage) {
        // check that actual SearchRequestParameters we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting minage of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        Integer actualMinage = actual.getMinage();
        if (!Objects.areEqual(actualMinage, minage)) {
            failWithMessage(assertjErrorMessage, actual, minage, actualMinage);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual SearchRequestParameters's minsize is equal to the given one.
     *
     * @param minsize the given minsize to compare the actual SearchRequestParameters's minsize to.
     * @return this assertion object.
     * @throws AssertionError - if the actual SearchRequestParameters's minsize is not equal to the given one.
     */
    public S hasMinsize(Integer minsize) {
        // check that actual SearchRequestParameters we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting minsize of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        Integer actualMinsize = actual.getMinsize();
        if (!Objects.areEqual(actualMinsize, minsize)) {
            failWithMessage(assertjErrorMessage, actual, minsize, actualMinsize);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual SearchRequestParameters's mode is equal to the given one.
     *
     * @param mode the given mode to compare the actual SearchRequestParameters's mode to.
     * @return this assertion object.
     * @throws AssertionError - if the actual SearchRequestParameters's mode is not equal to the given one.
     */
    public S hasMode(String mode) {
        // check that actual SearchRequestParameters we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting mode of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualMode = actual.getMode();
        if (!Objects.areEqual(actualMode, mode)) {
            failWithMessage(assertjErrorMessage, actual, mode, actualMode);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual SearchRequestParameters's offset is equal to the given one.
     *
     * @param offset the given offset to compare the actual SearchRequestParameters's offset to.
     * @return this assertion object.
     * @throws AssertionError - if the actual SearchRequestParameters's offset is not equal to the given one.
     */
    public S hasOffset(Integer offset) {
        // check that actual SearchRequestParameters we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting offset of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        Integer actualOffset = actual.getOffset();
        if (!Objects.areEqual(actualOffset, offset)) {
            failWithMessage(assertjErrorMessage, actual, offset, actualOffset);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual SearchRequestParameters's query is equal to the given one.
     *
     * @param query the given query to compare the actual SearchRequestParameters's query to.
     * @return this assertion object.
     * @throws AssertionError - if the actual SearchRequestParameters's query is not equal to the given one.
     */
    public S hasQuery(String query) {
        // check that actual SearchRequestParameters we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting query of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualQuery = actual.getQuery();
        if (!Objects.areEqual(actualQuery, query)) {
            failWithMessage(assertjErrorMessage, actual, query, actualQuery);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual SearchRequestParameters's searchRequestId is equal to the given one.
     *
     * @param searchRequestId the given searchRequestId to compare the actual SearchRequestParameters's searchRequestId to.
     * @return this assertion object.
     * @throws AssertionError - if the actual SearchRequestParameters's searchRequestId is not equal to the given one.
     */
    public S hasSearchRequestId(long searchRequestId) {
        // check that actual SearchRequestParameters we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting searchRequestId of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // check
        long actualSearchRequestId = actual.getSearchRequestId();
        if (actualSearchRequestId != searchRequestId) {
            failWithMessage(assertjErrorMessage, actual, searchRequestId, actualSearchRequestId);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual SearchRequestParameters's season is equal to the given one.
     *
     * @param season the given season to compare the actual SearchRequestParameters's season to.
     * @return this assertion object.
     * @throws AssertionError - if the actual SearchRequestParameters's season is not equal to the given one.
     */
    public S hasSeason(Integer season) {
        // check that actual SearchRequestParameters we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting season of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        Integer actualSeason = actual.getSeason();
        if (!Objects.areEqual(actualSeason, season)) {
            failWithMessage(assertjErrorMessage, actual, season, actualSeason);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual SearchRequestParameters's title is equal to the given one.
     *
     * @param title the given title to compare the actual SearchRequestParameters's title to.
     * @return this assertion object.
     * @throws AssertionError - if the actual SearchRequestParameters's title is not equal to the given one.
     */
    public S hasTitle(String title) {
        // check that actual SearchRequestParameters we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting title of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualTitle = actual.getTitle();
        if (!Objects.areEqual(actualTitle, title)) {
            failWithMessage(assertjErrorMessage, actual, title, actualTitle);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual SearchRequestParameters's tmdbId is equal to the given one.
     *
     * @param tmdbId the given tmdbId to compare the actual SearchRequestParameters's tmdbId to.
     * @return this assertion object.
     * @throws AssertionError - if the actual SearchRequestParameters's tmdbId is not equal to the given one.
     */
    public S hasTmdbId(String tmdbId) {
        // check that actual SearchRequestParameters we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting tmdbId of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualTmdbId = actual.getTmdbId();
        if (!Objects.areEqual(actualTmdbId, tmdbId)) {
            failWithMessage(assertjErrorMessage, actual, tmdbId, actualTmdbId);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual SearchRequestParameters's tvdbId is equal to the given one.
     *
     * @param tvdbId the given tvdbId to compare the actual SearchRequestParameters's tvdbId to.
     * @return this assertion object.
     * @throws AssertionError - if the actual SearchRequestParameters's tvdbId is not equal to the given one.
     */
    public S hasTvdbId(String tvdbId) {
        // check that actual SearchRequestParameters we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting tvdbId of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualTvdbId = actual.getTvdbId();
        if (!Objects.areEqual(actualTvdbId, tvdbId)) {
            failWithMessage(assertjErrorMessage, actual, tvdbId, actualTvdbId);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual SearchRequestParameters's tvmazeId is equal to the given one.
     *
     * @param tvmazeId the given tvmazeId to compare the actual SearchRequestParameters's tvmazeId to.
     * @return this assertion object.
     * @throws AssertionError - if the actual SearchRequestParameters's tvmazeId is not equal to the given one.
     */
    public S hasTvmazeId(String tvmazeId) {
        // check that actual SearchRequestParameters we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting tvmazeId of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualTvmazeId = actual.getTvmazeId();
        if (!Objects.areEqual(actualTvmazeId, tvmazeId)) {
            failWithMessage(assertjErrorMessage, actual, tvmazeId, actualTvmazeId);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual SearchRequestParameters's tvrageId is equal to the given one.
     *
     * @param tvrageId the given tvrageId to compare the actual SearchRequestParameters's tvrageId to.
     * @return this assertion object.
     * @throws AssertionError - if the actual SearchRequestParameters's tvrageId is not equal to the given one.
     */
    public S hasTvrageId(String tvrageId) {
        // check that actual SearchRequestParameters we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting tvrageId of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualTvrageId = actual.getTvrageId();
        if (!Objects.areEqual(actualTvrageId, tvrageId)) {
            failWithMessage(assertjErrorMessage, actual, tvrageId, actualTvrageId);
        }

        // return the current assertion for method chaining
        return myself;
    }

}