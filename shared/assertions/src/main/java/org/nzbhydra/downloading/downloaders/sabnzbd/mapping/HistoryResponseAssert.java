package org.nzbhydra.downloading.downloaders.sabnzbd.mapping;

/**
 * {@link HistoryResponse} specific assertions - Generated by CustomAssertionGenerator.
 * <p>
 * Although this class is not final to allow Soft assertions proxy, if you wish to extend it,
 * extend {@link AbstractHistoryResponseAssert} instead.
 */
@jakarta.annotation.Generated(value = "assertj-assertions-generator")
public class HistoryResponseAssert extends AbstractHistoryResponseAssert<HistoryResponseAssert, HistoryResponse> {

    /**
     * Creates a new <code>{@link HistoryResponseAssert}</code> to make assertions on actual HistoryResponse.
     *
     * @param actual the HistoryResponse we want to make assertions on.
     */
    public HistoryResponseAssert(HistoryResponse actual) {
        super(actual, HistoryResponseAssert.class);
    }

    /**
     * An entry point for HistoryResponseAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
     * With a static import, one can write directly: <code>assertThat(myHistoryResponse)</code> and get specific assertion with code completion.
     *
     * @param actual the HistoryResponse we want to make assertions on.
     * @return a new <code>{@link HistoryResponseAssert}</code>
     */
    @org.assertj.core.util.CheckReturnValue
    public static HistoryResponseAssert assertThat(HistoryResponse actual) {
        return new HistoryResponseAssert(actual);
    }
}