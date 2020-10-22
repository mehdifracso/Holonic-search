import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.lang.core.Event;
import java.util.Objects;
import java.util.UUID;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

@SarlSpecification("0.11")
@SarlElementType(15)
@SuppressWarnings("all")
public class FileFound extends Event {
  public final String path;
  
  public final UUID agentId;
  
  public FileFound(final String path, final UUID agentId) {
    this.agentId = agentId;
    this.path = path;
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
    FileFound other = (FileFound) obj;
    if (!Objects.equals(this.path, other.path))
      return false;
    if (!Objects.equals(this.agentId, other.agentId))
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
    result = prime * result + Objects.hashCode(this.agentId);
    return result;
  }
  
  /**
   * Returns a String representation of the FileFound event's attributes only.
   */
  @SyntheticMember
  @Pure
  protected void toString(final ToStringBuilder builder) {
    super.toString(builder);
    builder.add("path", this.path);
    builder.add("agentId", this.agentId);
  }
  
  @SyntheticMember
  private static final long serialVersionUID = 433446226L;
}
