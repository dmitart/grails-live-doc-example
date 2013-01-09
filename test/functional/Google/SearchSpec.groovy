package Google

import geb.spock.GebReportingSpec
import spock.lang.Stepwise

/**
 * It is possible to use different search methods.
 */

@Stepwise
class SearchSpec extends GebReportingSpec {

  @SkipLiveDoc
  def setupSpec() {

  }

  @SkipLiveDoc
  def cleanupSpec() {

  }

  /**
   * Search for pages that contain specific or relevant words
   */
  def "Simple search"() {
    given:
    to GooglePage
    
	when:
    searchFor('cat')
	
    then:
    resultContain('cat')
  }

  /**
   * Search for pages that contain exact phrase
   */
  def "Phrase search"() {
    given:
    to GooglePage
	
    when:
    searchFor('"foo bar"')
	
    then:
    resultContain('foo bar')
  }
  
}