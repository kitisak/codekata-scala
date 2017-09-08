package org.scalatr

/**
  * Project: cake-pattern
  *
  * Created on 1.11.2013 - Time: 18:07
  *
  * @author rayyildiz
  */
trait Users { this: UserRepositoryComponent =>

  def getUser(id: Long): User =
    userRepository.get(id)

  def saveUser(u: User): Long =
    userRepository.save(u)
}

trait UserInfos extends Users { this: UserRepositoryComponent =>

  def userFirstname(id: Long): String = getUser(id).firstName

  def userLastName(id: Long): String = getUser(id).lastName

}
