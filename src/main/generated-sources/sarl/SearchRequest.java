import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.lang.core.Event;
import java.util.Objects;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

/**
 * @author Mehdi
 */
@SarlSpecification("0.11")
@SarlElementType(15)
@SuppressWarnings("all")
public class SearchRequest extends Event {
  public final String path;
  
  public final String query;
  
  public SearchRequest(final String path, final String query) {
    this.path = path;
    this.query = query;
  }
  
  @Override
  @Pure
  @SyntheticMember
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    SearchRequest other = (SearchRequest) obj;
    if (!Objects.equals(this.path, other.path))
      return false;
    if (!Objects.equals(this.query, other.query))
      return false;
    return super.equals(obj);
  }
  
  @Override
  @Pure
  @SyntheticMember
  public int hashCode() {
    int result = super.hashCode();
    final int prime = 31;
    result = prime * result + Objects.hashCode(this.path);
    result = prime * result + Objects.hashCode(this.query);
    return result;
  }
  
  /**
   * Returns a String representation of the SearchRequest event's attributes only.
   */
  @SyntheticMember
  @Pure
  protected void toString(final ToStringBuilder builder) {
    super.toString(builder);
    builder.add("path", this.path);
    builder.add("query", this.query);
  }
  
  @SyntheticMember
  private static final long serialVersionUID = 3376740442L;
}
