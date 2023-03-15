package net.javaguides.springboot.model;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.persistence.JoinColumn;

@Entity
@Table(name =  "user", uniqueConstraints = @UniqueConstraint(columnNames = "username"))
public class User {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long user_id;
	public Long getUser_id() { return user_id; }
	public void setUser_id(Long user_id) { this.user_id = user_id; }
	
	private String username;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	private String password;
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(
			name = "users_roles",
			joinColumns = @JoinColumn(name = "user_id"),
			inverseJoinColumns = @JoinColumn(name = "role_id")
	)
	private Collection<Role> roles;
	public Collection<Role> getRoles() {
		return roles;
	}
	public void setRoles(Collection<Role> roles) {
		this.roles = roles;
	}

	@OneToMany(mappedBy = "user")
	private Set<Review> reviews = new HashSet<>();
	public Set<Review> getReviews() { return reviews; }
	public void setReviews(Set<Review> review) { this.reviews = review; }
	public void addReviews(Review review) { this.reviews.add(review); }

	public User() {
		
	}

	public User(String username, String password, Collection<Role> roles) {
//		this.id = id;
		this.username = username;
		this.password = password;
		this.roles = roles;
	}

}
