package org.scalatr

/**
  * Project: cake-pattern
  *
  * Created on 1.11.2013 - Time: 18:04
  *
  * @author rayyildiz
  */
trait UserRepositoryComponent {
  def userRepository: UserRepository

  trait UserRepository {
    def get(id: Long): User

    def save(user: User): Long
  }

}
