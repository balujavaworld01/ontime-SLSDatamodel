/*
 * @author <a href="mailto:glinga@soulstice.biz">Goutham Linga</a>
 */

package za.co.soulstice.model;

import java.io.Serializable;
import javax.persistence.*;

// TODO: Auto-generated Javadoc

@Entity
@Table(name = "smpp_provider")
public class SmppProvider implements Serializable {

	
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	
	private String ipAddress;

	
	private int maxTxSessions;

	
	private int maxRxSessions;

	
	private String name;

	
	private String route;

	
	private String password;

	
	private int port;

	
	private String username;

	
	private String status;

	
	@Column(name = "isRXStarted", columnDefinition = "BIT", nullable = true)
	private boolean isRXStarted;

	
	@Column(name = "isTXStarted", columnDefinition = "BIT", nullable = true)
	private boolean isTXStarted;

	
	public SmppProvider() {
	}

	
	public int getId() {
		return this.id;
	}

	
	public void setId(int id) {
		this.id = id;
	}

	
	public String getIpAddress() {
		return this.ipAddress;
	}

	
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	
	public String getStatus() {
		return status;
	}

	
	public void setStatus(String status) {
		this.status = status;
	}

	
	public String getRoute() {
		return route;
	}

	
	public void setRoute(String route) {
		this.route = route;
	}

	
	public boolean isRXStarted() {
		return isRXStarted;
	}

	
	public void setRXStarted(boolean isRXStarted) {
		this.isRXStarted = isRXStarted;
	}

	
	public boolean isTXStarted() {
		return isTXStarted;
	}

	
	public void setTXStarted(boolean isTXStarted) {
		this.isTXStarted = isTXStarted;
	}

	
	public String getName() {
		return this.name;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	
	public String getPassword() {
		return this.password;
	}

	
	public void setPassword(String password) {
		this.password = password;
	}

	
	public int getMaxTxSessions() {
		return maxTxSessions;
	}

	
	public void setMaxTxSessions(int maxTxSessions) {
		this.maxTxSessions = maxTxSessions;
	}

	
	public int getMaxRxSessions() {
		return maxRxSessions;
	}

	
	public void setMaxRxSessions(int maxRxSessions) {
		this.maxRxSessions = maxRxSessions;
	}

	
	public int getPort() {
		return this.port;
	}

	
	public void setPort(int port) {
		this.port = port;
	}

	
	public String getUsername() {
		return this.username;
	}

	
	public void setUsername(String username) {
		this.username = username;
	}

}